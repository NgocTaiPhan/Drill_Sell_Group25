package vn.edu.hcmuaf.controller;

public enum PageCategory {

    BATTERY_DRILL(1),
    HAMMER_DRILL(2),
    HAND_DRILL(3),
    MINI_DRILL(4),
    MOVERS(5),
    ACCESSORY(678);

    private final int page;

    PageCategory(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }
}
