{ pkgs ? import <nixpkgs> {} }:
pkgs.stdenv.mkDerivation rec {

    name = "AIDA";

    src = ./.;

    buildInputs = [

    ];

    nativeBuildInputs = [

    ];

    configurePhase = ''
    source "$stdenv"/setup
    mkdir $out

    '';

    buildPhase = ''

    cp --recursive "$src"/src/ $out

    '';

    installPhase = ''

    '';

}