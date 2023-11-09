class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int count=0;
        int totalEnergy =0;
        for(int i=0;i<energy.length;i++){
            totalEnergy+=energy[i];
            if(experience[i]>=initialExperience){
                int diff = experience[i]-initialExperience+1;
                count+=diff;
                initialExperience+=diff;
            }
            initialExperience+=experience[i];
        }
        if(initialEnergy<=totalEnergy){
            count+=totalEnergy-initialEnergy+1;
        }
        return count;
    }
}