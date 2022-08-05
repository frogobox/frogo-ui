package com.frogobox.ui.fireworks.initializers;

import com.frogobox.ui.fireworks.Particle;

import java.util.Random;

public class ScaleInitializer implements ParticleInitializer {

    private final float mMaxScale;
    private final float mMinScale;

    public ScaleInitializer(float minScale, float maxScale) {
        mMinScale = minScale;
        mMaxScale = maxScale;
    }

    @Override
    public void initParticle(Particle p, Random r) {
        float scale = r.nextFloat() * (mMaxScale - mMinScale) + mMinScale;
        p.mScale = scale;
    }

}
