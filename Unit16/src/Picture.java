import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set only blue*/
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to set only red*/
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to set only green*/
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set negate*/
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setBlue(255 - pixelObj.getBlue());
        pixelObj.setGreen(255 - pixelObj.getGreen());
      }
    }
  }
  
  /** Method to set grayscale*/
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int average = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen()) / 3;
        pixelObj.setRed(average);
        pixelObj.setBlue(average);
        pixelObj.setGreen(average);
      }
    }
  }
  
  /** Method to set fixUnderwater*/
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	  pixelObj.setRed(pixelObj.getRed()*5 - 637);
          pixelObj.setBlue(pixelObj.getBlue()*5 - 637);
          pixelObj.setGreen(pixelObj.getGreen()*5 - 637);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width/2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++)
    {
    	for (int row = 0; row < pixels.length / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - row -1][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++)
    {
    	for (int row = 0; row < pixels.length / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - row -1][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a snowman */
  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
   
    
    for (int col = 105; col < 294; col++)
    {
    	for (int row = mirrorPoint; row > 162; row--)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  /** Mirror just part of a picture of a seagull */
  public void mirrorGull()
  {
    int mirrorPoint = 350;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
   
    for (int row = 230; row < 325; row++)
    {
    	for (int col = 230; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    for (int row = 0; row < 480; row++)
    {
    	for (int col = 0; col < 480; col++)
      {
        leftPixel = pixels[col][row];
        rightPixel = pixels[row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
    
   
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  public void copy2(Picture fromPic, int startRow, int startCol, int endRow, int endCol)
{
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; fromRow < endRow && toRow < endRow; fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < endCol && toCol < endCol; fromCol++, toCol++)
		  {
		fromPixel = fromPixels[fromRow][fromCol];
		toPixel = toPixels[toRow][toCol];
		toPixel.setColor(fromPixel.getColor());
		  }
	  }   
}
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    Picture flower2 = new Picture("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("H:\\APCS\\Units\\Unit16\\Unit16-Assignments-pixLab\\images\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  /** Method to show large changes in color 
   * @param edgeDist the distance for finding edges
   */
 public void edgeDetection2(int edgeDist)
 {
   Pixel leftPixel = null;
   Pixel rightPixel = null;
   Pixel bottomPixel = null;
   Pixel topPixel = null;
   Pixel[][] pixels = this.getPixels2D();
   Color rightColor = null;
   Color topColor = null;
   for (int row = 0; row < pixels.length-1; row++)
   {
     for (int col = 0; col < pixels[0].length-1; col++)
     {
       leftPixel = pixels[row][col];
       rightPixel = pixels[row][col+1];
       rightColor = rightPixel.getColor();
       topPixel = pixels[row+1][col];
       bottomPixel = pixels[row][col];
       topColor = topPixel.getColor();
       if (leftPixel.colorDistance(rightColor) > edgeDist && bottomPixel.colorDistance(topColor) > edgeDist) {
    	  leftPixel.setColor(Color.BLACK);
       	  bottomPixel.setColor(Color.BLACK);	
       } else {
         leftPixel.setColor(Color.WHITE);
         bottomPixel.setColor(Color.WHITE);
       }
     }
   }
 }
 
 
 
 //***************************** ENCODE AND DECODE  *******************************************************************************//
 
 public Boolean[][] createMatrix(Pixel[][] orig, Pixel[][] msg) {
	 
	 Boolean[][] matrix = new Boolean[msg.length][msg[0].length];
	 
	 for (int i = 0; i < msg.length; i++) {
			for (int j = 0; j < msg[i].length;j++) {
				if (msg[i][j].getRed() == 0 && msg[i][j].getBlue() == 0 && msg[i][j].getGreen() == 0) { 
					matrix[i][j] = true;
				}
				else {
					matrix[i][j] = false;
				}
			 }
		 }
	 return matrix;
	 
 }
 
 public void encode(Picture msg) {
	 
	 Pixel[][] originalPixels = this.getPixels2D();
	 Pixel[][] msgPixels = msg.getPixels2D();
	 Boolean[][] msgLocations = new Boolean[msgPixels.length][msgPixels[0].length];
	 
	//generates a boolean matrix of message pixel locations
	msgLocations = createMatrix(originalPixels, msgPixels);
/*	 
	 for (int i = 0; i < msgPixels.length; i++) {
		for (int j = 0; j < msgPixels[i].length;j++) {
			if (msgPixels[i][j].getRed() == 0 && msgPixels[i][j].getBlue() == 0 && msgPixels[i][j].getGreen() == 0) { 
				msgLocations[i][j] = true;
			}
			else {
				msgLocations[i][j] = false;
			}
		 }
	 }
*/	
	for (int i = 1; i < originalPixels.length-1; i++) {
		for (int j = 1; j < originalPixels[i].length-1; j++) {
			if (msgLocations[i][j] == true) {
				int leftRed = originalPixels[i][j-1].getRed();
			   	int leftGreen = originalPixels[i][j-1].getGreen();
			   	int leftBlue = originalPixels[i][j-1].getBlue();
			   	int topRed = originalPixels[i-1][j].getRed();
			   	int topGreen = originalPixels[i-1][j].getGreen();
			   	int topBlue = originalPixels[i-1][j].getBlue();
			   	int rightRed = originalPixels[i][j+1].getRed();
			   	int rightGreen = originalPixels[i][j+1].getGreen();
			   	int rightBlue = originalPixels[i][j+1].getBlue();
			   	int bottomRed = originalPixels[i+1][j].getRed();
			   	int bottomGreen = originalPixels[i+1][j].getGreen();
			   	int bottomBlue = originalPixels[i+1][j].getBlue();
	/*		   	
			   	if (leftRed % 2 != 0) {
			   		leftRed = leftRed - 1;
			   	} else {
			   		leftRed = leftRed + 1;
			   	}
			   	if (leftGreen % 2 != 0) {
			   		leftGreen = leftGreen - 1;
			   	} else {
			   		leftGreen = leftGreen + 1;
			   	}
			   	if (leftBlue % 2 != 0) {
			   		leftBlue = leftBlue - 1;
			   	} else {
			   		leftBlue = leftBlue + 1;
			   	}
			   	
			   	if (rightRed % 2 != 0) {
			   		rightRed = rightRed - 1;
			   	} else {
			   		rightRed = rightRed + 1;
			   	}
			   	if (rightGreen % 2 != 0) {
			   		rightGreen = rightGreen - 1;
			   	} else {
			   		rightGreen = rightGreen + 1;
			   	}
			   	if (rightBlue % 2 != 0) {
			   		rightBlue = rightBlue - 1;
			   	} else {
			   		rightBlue = rightBlue + 1;
			   	}
			   	
			   	int newRed;
			   	int newGreen;
			   	int newBlue;
			   	
			   	if (leftRed > rightRed) {
			   		newRed = leftRed;
			   	} else {
			   		newRed = rightRed;
			   	}
			   	
			   	if (leftGreen > rightGreen) {
			   		newGreen = leftGreen;
			   	} else {
			   		newGreen = rightGreen;
			   	} 
			   	
			   	if (leftBlue > rightBlue) {
			   		newBlue = leftBlue;
			   	} else {
			   		newBlue = rightBlue;
			   	}
*/			   	
			   	
			   	int redAverage = (leftRed + rightRed + topRed + bottomRed) / 4;
			   	int greenAverage = (leftGreen + rightGreen + topGreen + bottomGreen) / 4;
			   	int blueAverage = (leftBlue + rightBlue + topBlue + bottomBlue) / 4;
			   	
			   	originalPixels[i][j].setRed(redAverage);
			   	originalPixels[i][j].setGreen(greenAverage);
			   	originalPixels[i][j].setBlue(blueAverage);
			   	
			}
		}
	}
	
	 
 }
 
 
 public void decode(Picture msg) {
	 
	 Pixel[][] originalPixels = this.getPixels2D();
	 Pixel[][] msgPixels = msg.getPixels2D();
	 Boolean[][] msgLocations = new Boolean[msgPixels.length][msgPixels[0].length];
	 
	 msgLocations = createMatrix(originalPixels, msgPixels);
	 
	 for (int i = 0; i < msgLocations.length; i++) {
		 for (int j = 0; j < msgLocations[0].length; j++) {
			 if (msgLocations[i][j] == true) {
				 originalPixels[i][j].setColor(Color.BLACK);
			 } else {
				 originalPixels[i][j].setColor(Color.WHITE);
			 }
		 }
	 }

	 	 
	 
	 
	
 }
 
 
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
