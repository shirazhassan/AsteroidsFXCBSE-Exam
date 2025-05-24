import dk.sdu.cbse.common.services.IEntityProcessingService;
import dk.sdu.cbse.common.services.IGamePluginService;

module Asteroid {
    requires Common;
    requires CommonAsteroids;
    provides IGamePluginService with dk.sdu.cbse.asteroid.AsteroidPlugin;
    provides IEntityProcessingService with dk.sdu.cbse.asteroid.AsteroidProcessor;
}