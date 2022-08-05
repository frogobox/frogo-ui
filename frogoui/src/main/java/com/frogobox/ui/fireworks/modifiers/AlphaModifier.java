package com.frogobox.ui.fireworks.modifiers;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import com.frogobox.ui.fireworks.Particle;

public class AlphaModifier implements ParticleModifier {

    private final int mInitialValue;
    private final int mFinalValue;
    private final long mStartTime;
    private final long mEndTime;
    private final float mDuration;
    private final float mValueIncrement;
    private final Interpolator mInterpolator;

    public AlphaModifier(int initialValue, int finalValue, long startMilis, long endMilis, Interpolator interpolator) {
        mInitialValue = initialValue;
        mFinalValue = finalValue;
        mStartTime = startMilis;
        mEndTime = endMilis;
        mDuration = mEndTime - mStartTime;
        mValueIncrement = mFinalValue - mInitialValue;
        mInterpolator = interpolator;
    }

    public AlphaModifier(int initialValue, int finalValue, long startMilis, long endMilis) {
        this(initialValue, finalValue, startMilis, endMilis, new LinearInterpolator());
    }

    @Override
    public void apply(Particle particle, long miliseconds) {
        if (miliseconds < mStartTime) {
            particle.mAlpha = mInitialValue;
        } else if (miliseconds > mEndTime) {
            particle.mAlpha = mFinalValue;
        } else {
            float interpolaterdValue = mInterpolator.getInterpolation((miliseconds - mStartTime) * 1f / mDuration);
            int newAlphaValue = (int) (mInitialValue + mValueIncrement * interpolaterdValue);
            particle.mAlpha = newAlphaValue;
        }
    }

}
