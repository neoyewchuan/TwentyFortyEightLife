package com.thefatoldman.twentyfortyeightlife;

public interface SwipeCallback {

    void onSwipe(Direction direction);

    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
