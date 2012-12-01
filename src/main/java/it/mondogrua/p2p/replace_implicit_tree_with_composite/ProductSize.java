package it.mondogrua.p2p.replace_implicit_tree_with_composite;

public enum ProductSize {
    NOT_APPLICABLE("not applicable"),
    SMALL("small"),
    MEDIUM("medium");

    private final String descr;

    ProductSize(String descr) {
        this.descr = descr;
    }

    public String toString() {
        return this.descr;
    }

}
