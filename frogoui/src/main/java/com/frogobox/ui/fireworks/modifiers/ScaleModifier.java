package com.frogobox.ui.fireworks.modifiers;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import com.frogobox.ui.fireworks.Particle;

public class ScaleModifier implements ParticleModifier {

    private final float mInitialValue;
    private final float mFinalValue;
    private final long mEndTime;
    private final long mStartTime;
    private final long mDuration;
    private final float mValueIncrement;
    private final Interpolator mInterpolator;

    public ScaleModifier(float initialValue, float finalValue, long startMilis, long endMilis, Interpolator interpolator) {
        mInitialValue = initialValue;
        mFinalValue = finalValue;
        mStartTime = startMilis;
        mEndTime = endMilis;
        mDuration = mEndTime - mStartTime;
        mValueIncrement = mFinalValue - mInitialValue;
        mInterpolator = interpolator;
    }

    public ScaleModifier(float initialValue, float finalValue, long startMilis, long endMilis) {
        this(initialValue, finalValue, startMilis, endMilis, new LinearInterpolator());
    }

    @Override
    public void apply(Particle particle, long miliseconds) {
        if (miliseconds < mStartTime) {
            particle.mScale = mInitialValue;
        } else if (miliseconds > mEndTime) {
            particle.mScale = mFinalValue;
        } else {
            float interpolaterdValue = mInterpolator.getInterpolation((miliseconds - mStartTime) * 1f / mDuration);
            float newScale = mInitialValue + mValueIncrement * interpolaterdValue;
            particle.mScale = newScale;
        }
    }

}
