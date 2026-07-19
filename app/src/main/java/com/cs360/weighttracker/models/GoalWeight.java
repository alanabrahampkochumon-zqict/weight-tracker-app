package com.cs360.weighttracker.models;


/**
 * An interface to keep track of user's goal and target weight.
 */
public class GoalWeight {

    private float currentWeight, goalWeight;

    GoalWeight(float currentWeight, float goalWeight) {
        this.currentWeight = currentWeight;
        this.goalWeight = goalWeight;
    }


    /// ////////////////////////
    ///       GETTERS      ///
    /// ///////////////////////

    public float getCurrentWeight() {
        return currentWeight;
    }

    public float getGoalWeight() {
        return goalWeight;
    }

    /// ////////////////////////
    ///       SETTERS      ///
    /// ///////////////////////

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setGoalWeight(float goalWeight) {
        this.goalWeight = goalWeight;
    }

    /**
     * Returns user goals given the current goal and target weights.
     */
    public GoalType getGoalType() {
        if (goalWeight > currentWeight) {
            return GoalType.WEIGHT_GAIN;
        } else if (goalWeight < currentWeight) {
            return GoalType.WEIGHT_LOSS;
        } else {
            return GoalType.WEIGHT_MAINTAIN;
        }
    }
}
