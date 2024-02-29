package net.szolim.tutorial;

import net.fabricmc.api.ClientModInitializer;

public class TutorialClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello Fabric world! (client)");
    }
}
