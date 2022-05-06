package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class GenerationCheckTest {

    @Test
    public void GenerationCheckAlpha(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("Generation Alpha", ac.GenerationCheck(2011));
    }

    @Test
    public void GenerationCheckZ(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("Generation Z", ac.GenerationCheck(2000));
    }

    @Test
    public void GenerationCheckY(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("Generation Y", ac.GenerationCheck(1982));
    }

    @Test
    public void GenerationCheckX(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("Generation X", ac.GenerationCheck(1967));
    }

    @Test
    public void GenerationCheckBoomer(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("Generation Boomer", ac.GenerationCheck(1950));
    }

    @Test
    public void GenerationCheckSilent(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("Generation Silent", ac.GenerationCheck(1930));
    }

    @Test
    public void GenerationCheckUndefiniert(){
        GenerationCheck ac = new GenerationCheck();
        Assert.assertEquals("undefinierbar", ac.GenerationCheck(10));
    }
}
