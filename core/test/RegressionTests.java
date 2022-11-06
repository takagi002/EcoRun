import com.hechsmanwilczak.ecorun.Scenes.Hud;
import com.hechsmanwilczak.ecorun.Screens.PlayScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RegressionTests {
    @Test
    public void testGetHud() {
        PlayScreen playScreen = Mockito.mock(PlayScreen.class);
        when(playScreen.getHud()).thenReturn(Mockito.mock(Hud.class));
        Assert.assertEquals(Hud.class, playScreen.getHud().getClass());
    }

    // in game functions
    @Test
    public void testMovementKeys(){
        //test UP, LEFT, RIGHT keys for movement

    }

    @Test
    public void testcollectItems(){

    }

    @Test
    public void testScoreChanges(){
        //increase in score

        //decrease in score
    }

    @Test
    public void testKillEnemy(){

    }

    @Test
    public void testLoseLife(){

    }

    @Test
    public void testFailLevel(){
        // lost all lives

        // automatic loss
    }


    // menu functions

    @Test
    public void testLevelSelection(){

    }

    @Test
    public void testRestartGame(){

    }

    @Test
    public void testPauseButton(){

    }
}
