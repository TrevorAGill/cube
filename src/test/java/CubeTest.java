import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/10/17.
 */
public class CubeTest {
    @Test
    public void newCube_instantiatesCorrectly() throws Exception {
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertTrue(testCube instanceof Cube);
    }

    @Test
    public void newCube_savesRectangle_true() throws Exception {
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(testRectangle, testCube.getFace());
    }

    @Test
    public void volume_determinesTheVolumeOfTheCube_27000() throws Exception {
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(27000, testCube.volume());
    }

    @Test
    public void volume_determinesTheSurfaceAreaOfACube_5400() throws Exception {
        Rectangle testRectangle = new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(5400, testCube.surfaceArea());
    }

    @Test
    public void area_returnAreaOfRectangle_450() throws Exception {
        Rectangle testRectangle = new Rectangle(15,30);
        assertEquals(450, testRectangle.area());
    }
}