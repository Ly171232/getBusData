package ly.test.com.pojo;

public class MatterDetails {
    private int matterId;
    private String matterTitle;
    private String matterType;
    private String frequency;
    private String workName;
    private String entrustDept;
    private String workChildrenName;
    private String implementationPerson;
    private String testType;
    private String inspectItemContentList;

    public MatterDetails() {
    }

    public MatterDetails(int matterId, String matterTitle, String matterType, String frequency, String workName, String entrustDept, String workChildrenName, String implementationPerson, String testType, String inspectItemContentList) {
        this.matterId = matterId;
        this.matterTitle = matterTitle;
        this.matterType = matterType;
        this.frequency = frequency;
        this.workName = workName;
        this.entrustDept = entrustDept;
        this.workChildrenName = workChildrenName;
        this.implementationPerson = implementationPerson;
        this.testType = testType;
        this.inspectItemContentList = inspectItemContentList;
    }

    public int getMatterId() {
        return matterId;
    }

    public void setMatterId(int matterId) {
        this.matterId = matterId;
    }

    public String getMatterTitle() {
        return matterTitle;
    }

    public void setMatterTitle(String matterTitle) {
        this.matterTitle = matterTitle;
    }

    public String getMatterType() {
        return matterType;
    }

    public void setMatterType(String matterType) {
        this.matterType = matterType;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getEntrustDept() {
        return entrustDept;
    }

    public void setEntrustDept(String entrustDept) {
        this.entrustDept = entrustDept;
    }

    public String getWorkChildrenName() {
        return workChildrenName;
    }

    public void setWorkChildrenName(String workChildrenName) {
        this.workChildrenName = workChildrenName;
    }

    public String getImplementationPerson() {
        return implementationPerson;
    }

    public void setImplementationPerson(String implementationPerson) {
        this.implementationPerson = implementationPerson;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getInspectItemContentList() {
        return inspectItemContentList;
    }

    public void setInspectItemContentList(String inspectItemContentList) {
        this.inspectItemContentList = inspectItemContentList;
    }
}
