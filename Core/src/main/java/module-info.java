module Core {
    requires Common;

    requires CommonBullet;
    requires javafx.graphics;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    exports dk.sdu.cbse.main;
    opens dk.sdu.cbse.main to javafx.graphics,spring.core;
    uses dk.sdu.cbse.common.services.IGamePluginService;
    uses dk.sdu.cbse.common.services.IEntityProcessingService;
    uses dk.sdu.cbse.common.services.IPostEntityProcessingService;
}


