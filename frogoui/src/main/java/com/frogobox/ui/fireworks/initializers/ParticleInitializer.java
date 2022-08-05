package com.frogobox.ui.fireworks.initializers;

import com.frogobox.ui.fireworks.Particle;

import java.util.Random;

public interface ParticleInitializer {

    void initParticle(Particle p, Random r);

}
