package com.frogobox.ui.fireworks.modifiers;


import com.frogobox.ui.fireworks.Particle;

public interface ParticleModifier {

    /**
     * modifies the specific value of a particle given the current miliseconds
     *
     * @param particle
     * @param miliseconds
     */
    void apply(Particle particle, long miliseconds);

}
