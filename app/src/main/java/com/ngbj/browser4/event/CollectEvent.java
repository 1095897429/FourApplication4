package com.ngbj.browser4.event;

public class CollectEvent {
    private  int type;
    public CollectEvent(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
