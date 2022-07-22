package JavaRush.lvl8tasks.tsk24;

import java.util.ArrayList;

class Solution {
    static LittleRedRidingHood hood = new LittleRedRidingHood();
    static Grandmother grandmother = new Grandmother();
    static Patty patty = new Patty();
    static Woodman woodman = new Woodman();
    static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }

    //красная шапочка
    static class LittleRedRidingHood extends StoryItem {
    }

    //бабушка
    static class Grandmother extends StoryItem {
    }

    //пирожек
    static class Patty extends StoryItem {
    }

    //дровосек
    static class Woodman extends StoryItem {
    }

    //волк
    static class Wolf extends StoryItem {
    }

    static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}
