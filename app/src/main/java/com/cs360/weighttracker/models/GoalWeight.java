package com.cs360.weighttracker.models;


/**
 * An interface to keep track of user's goal and target weight.
 */
public class GoalWeight {

    private float goalWeight, targetWeight;

    GoalWeight(float goalWeight, float targetWeight) {
        this.goalWeight = goalWeight;
        this.targetWeight = targetWeight;
    }


    ///////////////////////////
    ///       GETTERS      ///
    //////////////////////////
    public float getGoalWeight() {
        return goalWeight;
    }

    public float getTargetWeight() {
        return targetWeight;
    }

    ///////////////////////////
    ///       SETTERS      ///
    //////////////////////////
    public void setGoalWeight(float goalWeight) {
        this.goalWeight = goalWeight;
    }

    public void setTargetWeight(float targetWeight) {
        this.targetWeight = targetWeight;
    }

    /**
     * Returns user goals given the current goal and target weights.
     */
    public GoalType getJourneyType() {
        if (targetWeight > goalWeight) {
            return GoalType.WEIGHT_GAIN;
        } else if (targetWeight < goalWeight) {
            return GoalType.WEIGHT_LOSS;
        } else {
            return GoalType.WEIGHT_MAINTAIN;
        }
    }
}
