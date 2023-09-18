{
  description = "AIDA";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/22.11";
    utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, utils, ... }@inputs:

    inputs.utils.lib.eachSystem [ "x86_64-linux" "aarch64-darwin" ]

    (system: let
      pkgname = "AIDA";

      pkgs = import nixpkgs {
        inherit system;
        overlays = [];
        config.allowUnfree = true;
      };

      deps = ps: with ps; [

      ];

      in {
        devShells.default = pkgs.mkShell rec {
          name = pkgname;
          packages = deps pkgs;
        };

        packages.default = pkgs.stdenv.mkDerivation rec {
         name = pkgname;
         src = self;
         buildInputs = deps pkgs;

         configurePhase = ''
          source "$stdenv"/setup
          mkdir $out
         '';

         buildPhase = ''
          cp --recursive "$src"/src/ $out
         '';

         installPhase = ''
         '';
       };
      }
    );
}
