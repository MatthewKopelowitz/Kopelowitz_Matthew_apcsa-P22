/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
    Picture underwater = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\water.jpg");
    underwater.explore();
    underwater.fixUnderwater();
    underwater.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
    redMotorcycle.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    Picture gull = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test the copy method */
  public static void testCopy()
  {
    Picture flower1 = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    Picture canvas = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.copy2(flower1, 0, 0, 50, 100);
    canvas.copy2(flower1, 50, 0, 100, 50);
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test edgeDetection2 */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    
	//testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
	//testNegate();  
    //testGrayscale();  
    //testFixUnderwater();  
    //testMirrorVertical();  
    //testMirrorTemple();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorArms();
    //testMirrorGull();
	  
    testMirrorDiagonal(); //COME BACK TO
    //testCollage();
    //testCopy();
	//testEdgeDetection();
    //testEdgeDetection2();
	  
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}