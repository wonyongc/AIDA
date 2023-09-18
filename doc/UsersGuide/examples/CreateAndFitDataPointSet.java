import hep.aida.*;

public class CreateAndFitDataPointSet {

   public static void main(String[] argv) {    

      IAnalysisFactory     af     = IAnalysisFactory.create();
      ITree                tree   = af.createTreeFactory().create();
      IDataPointSetFactory dpsf   = af.createDataPointSetFactory(tree);
      IFunctionFactory     funcF  = af.createFunctionFactory(tree);
      IFitFactory          fitF   = af.createFitFactory();
      IFitter              fitter = fitF.createFitter("Chi2","uncmin");

      // Create a two dimensional IDataPointSet.
      IDataPointSet dataPointSet = dpsf.create("dataPointSet","two dimensional IDataPointSet",2);

      // Fill the two dimensional IDataPointSet
      double[] yVals2D = { 0.12, 0.22, 0.35, 0.42, 0.54 , 0.61 };
      double[] yErrP2D = { 0.01, 0.02, 0.03, 0.03, 0.04 , 0.04 };
      double[] yErrM2D = { 0.02, 0.02, 0.02, 0.04, 0.06 , 0.05 };
      double[] xVals2D = { 1.5, 2.6, 3.4, 4.6, 5.5 , 6.4 };
      double[] xErrP2D = { 0.5, 0.5, 0.4, 0.4, 0.5 , 0.5 };

      for ( int i = 0; i<yVals2D.length; i++ ) {
        dataPointSet.addPoint();
        dataPointSet.point(i).coordinate(0).setValue( xVals2D[i] );
        dataPointSet.point(i).coordinate(0).setErrorPlus( xErrP2D[i] );
        dataPointSet.point(i).coordinate(1).setValue( yVals2D[i] );
        dataPointSet.point(i).coordinate(1).setErrorPlus( yErrP2D[i] );
        dataPointSet.point(i).coordinate(1).setErrorMinus( yErrM2D[i] );
      }


      //Create a 1d second order polynomial
      IFunction p2 = funcF.createFunctionFromScript("p2", 1, "a+b*x[0]+c*x[0]*x[0]", "a,b,c","",null); 

      IFitData data = fitF.createFitData();
      data.create1DConnection(dataPointSet,0,1);

      IFitResult fittedFunction = fitter.fit(data,p2);

      // Display the results
      IPlotter plotter = af.createPlotterFactory().create("Plot IDataPointSets");
      plotter.createRegions();
      plotter.region(0).plot( dataPointSet );
      plotter.region(0).plot( fittedFunction.fittedFunction() );
      plotter.show();


   }
}







