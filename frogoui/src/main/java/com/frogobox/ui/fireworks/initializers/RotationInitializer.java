package com.frogobox.ui.fireworks.initializers;

import com.frogobox.ui.fireworks.Particle;

import java.util.Random;

public class RotationInitializer implements ParticleInitializer {

    private final int mMinAngle;
    private final int mMaxAngle;

    public RotationInitializer(int minAngle, int maxAngle) {
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }

    @Override
    public void initParticle(Particle p, Random r) {
        p.mInitialRotation = (mMinAngle == mMaxAngle) ? mMinAngle : r.nextInt(mMaxAngle - mMinAngle) + mMinAngle;
    }

}
