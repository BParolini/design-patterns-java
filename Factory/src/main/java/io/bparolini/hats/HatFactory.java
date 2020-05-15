package io.bparolini.hats;

public final class HatFactory {

    private HatFactory() {
        super();
    }

    public static Hat getHat(HatType hatType) {
        return switch (hatType) {
            case FEDORA:
                yield new Fedora();
            case FEZ:
                yield new Fez();
            case BOWLER:
                yield new Bowler();
            case NEWSBOY:
                yield new Newsboy();
        };
    }
}
