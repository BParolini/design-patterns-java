package io.bparolini;

import io.bparolini.hats.Hat;
import io.bparolini.hats.HatFactory;
import io.bparolini.hats.HatType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HatFactoryTest {

    @Test
    public void factoryTest() {
        final Hat fedora = HatFactory.getHat(HatType.FEDORA);
        final Hat fez = HatFactory.getHat(HatType.FEZ);
        final Hat bowler = HatFactory.getHat(HatType.BOWLER);
        final Hat newsboy = HatFactory.getHat(HatType.NEWSBOY);

        Assertions.assertTrue(fedora.hatDesign().toLowerCase().contains("fedora"));
        Assertions.assertTrue(fez.hatDesign().toLowerCase().contains("fez"));
        Assertions.assertTrue(bowler.hatDesign().toLowerCase().contains("bowler"));
        Assertions.assertTrue(newsboy.hatDesign().toLowerCase().contains("newsboy"));

        System.out.println(fedora.hatDesign());
        System.out.println(fez.hatDesign());
        System.out.println(bowler.hatDesign());
        System.out.println(newsboy.hatDesign());
    }
}
