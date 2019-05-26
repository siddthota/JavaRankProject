public class RankSolver {
    String branch;
    float rank;
    String gender;
    String caste;
    String region;

    public RankSolver(String branch, float rank, String gender, String caste, String region) {
        this.branch = branch;
        this.rank = rank;
        this.gender = gender;
        this.caste = caste;
        this.region = region;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "RankSolver{" +
                "branch='" + branch + '\'' +
                ", rank=" + rank +
                ", gender='" + gender + '\'' +
                ", caste='" + caste + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
