public class Student {
    private int id;
    private String hallticket;
    private float rank;
    private String candidateName;
    private String gender;
    private String caste;
    private String region;
    private String seat_category;

    public Student(int id, String hallticket, float rank, String candidateName, String gender, String caste, String region, String seat_category) {
        this.id = id;
        this.hallticket = hallticket;
        this.rank = rank;
        this.candidateName = candidateName;
        this.gender = gender;
        this.caste = caste;
        this.region = region;
        this.seat_category = seat_category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHallticket() {
        return hallticket;
    }

    public void setHallticket(String hallticket) {
        this.hallticket = hallticket;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
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

    public String getSeat_category() {
        return seat_category;
    }

    public void setSeat_category(String seat_category) {
        this.seat_category = seat_category;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", hallticket='" + hallticket + '\'' +
                ", rank=" + rank +
                ", candidateName='" + candidateName + '\'' +
                ", gender='" + gender + '\'' +
                ", caste='" + caste + '\'' +
                ", region='" + region + '\'' +
                ", seat_category='" + seat_category + '\'' +
                '}';
    }
}
