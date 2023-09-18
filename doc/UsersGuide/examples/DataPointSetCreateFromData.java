import hep.aida.*;

public class DataPointSetCreateFromData
{
   public static void main(String[] argv) throws java.io.IOException
   {    
      IAnalysisFactory af = IAnalysisFactory.create();

      // Create a tree loading the AIDA objects stored in an AIDA file.
      ITree tree = af.createTreeFactory().create("aidaStore.aida");

      IDataPointSetFactory dpsf = af.createDataPointSetFactory(tree);

      IHistogram1D h1 = (IHistogram1D) tree.find("h1");
      IProfile2D   p2 = (IProfile2D)   tree.find("p2");
      ICloud3D     c3 = (ICloud3D)     tree.find("c3");
        
      // Create IDataPointSets from the the above AIDA objects.
      IDataPointSet dps1DFromHist   = dpsf.create("dps1DFromHist",h1);
      IDataPointSet dps2DFromProf   = dpsf.create("dps2DFromProf",p2);
      IDataPointSet dps3DFromCloud  = dpsf.create("dps2DFromCloud",c3);
   }
}
