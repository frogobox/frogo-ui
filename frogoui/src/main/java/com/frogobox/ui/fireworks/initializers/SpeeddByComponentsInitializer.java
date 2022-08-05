package com.frogobox.ui.fireworks.initializers;

import com.frogobox.ui.fireworks.Particle;

import java.util.Random;

public class SpeeddByComponentsInitializer implements ParticleInitializer {

    private final float mMinSpeedX;
    private final float mMaxSpeedX;
    private final float mMinSpeedY;
    private final float mMaxSpeedY;

    public SpeeddByComponentsInitializer(float speedMinX, float speedMaxX, float speedMinY, float speedMaxY) {
        mMinSpeedX = speedMinX;
        mMaxSpeedX = speedMaxX;
        mMinSpeedY = speedMinY;
        mMaxSpeedY = speedMaxY;
    }

    @Override
    public void initParticle(Particle p, Random r) {
        p.mSpeedX = r.nextFloat() * (mMaxSpeedX - mMinSpeedX) + mMinSpeedX;
        p.mSpeedY = r.nextFloat() * (mMaxSpeedY - mMinSpeedY) + mMinSpeedY;
    }

}
