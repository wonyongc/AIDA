import hep.aida.*;
import java.util.Random;
import java.io.IOException;

public class Restore 
{
   public static void main(String[] argv) throws IOException
   {
      IAnalysisFactory af = IAnalysisFactory.create();
      ITree tree = af.createTreeFactory().create("myFile.aida","xml");
      
      IHistogram1D h1d = (IHistogram1D) tree.find("test 1d");
      IHistogram2D h2d = (IHistogram2D) tree.find("test 2d");
      
      IPlotter plotter = af.createPlotterFactory().create("Test");
      plotter.createRegions(2,1);
      plotter.region(0).plot(h1d);
      plotter.region(1).plot(h2d);
      plotter.show();
   }
}
