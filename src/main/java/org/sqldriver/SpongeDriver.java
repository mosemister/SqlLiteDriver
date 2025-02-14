package org.sqldriver;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.ConstructPluginEvent;
import org.spongepowered.plugin.builtin.jvm.Plugin;

@Plugin("sqllite_driver")
public class SpongeDriver {

    @Listener
    public void onPluginCreate(ConstructPluginEvent event) {
        try {
            Class.forName("org.sqlite.JDBC");
            event.plugin().logger().info("SQLLite loaded");
        } catch (ClassNotFoundException e) {
            event.plugin().logger().error("Failed to load the SQL Lite driver", e);
        }

    }
}
