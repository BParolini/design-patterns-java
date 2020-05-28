package io.bparolini.hats;

public final class HatFactory {

    private HatFactory() {
        super();
    }

    public static Hat getHat(HatType hatType) {
        return switch (hatType) {
            case FEDORA -> new Fedora();
            case FEZ -> new Fez();
            case BOWLER -> new Bowler();
            case NEWSBOY -> new Newsboy();
        };
    }
}
