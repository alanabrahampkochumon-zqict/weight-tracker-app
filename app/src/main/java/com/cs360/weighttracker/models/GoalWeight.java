package com.cs360.weighttracker.models;


/**
 * An interface to keep track of user's goal and target weight.
 */
public class GoalWeight {

    private float goalWeight, currentWeight;

    GoalWeight(float goalWeight, float currentWeight) {
        this.goalWeight = goalWeight;
        this.currentWeight = currentWeight;
    }


    ///////////////////////////
    ///       GETTERS      ///
    //////////////////////////
    public float getGoalWeight() {
        return goalWeight;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    ///////////////////////////
    ///       SETTERS      ///
    //////////////////////////
    public void setGoalWeight(float goalWeight) {
        this.goalWeight = goalWeight;
    }

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    /**
     * Returns user goals given the current goal and target weights.
     */
    public GoalType getJourneyType() {
        if (currentWeight > goalWeight) {
            return GoalType.WEIGHT_GAIN;
        } else if (currentWeight < goalWeight) {
            return GoalType.WEIGHT_LOSS;
        } else {
            return GoalType.WEIGHT_MAINTAIN;
        }
    }
}
