package edu.bhcc.xianbinzhen.mixandmatch;

import java.io.Serializable;

// serialization is a process of converting an object into stream, so we can store that in a database, file or memory
public class Medicine implements Serializable {

    // Class instances
    String genericName;
    String brandName;
    String purpose;
    String deaSch;
    String special;
    String category;
    String studyTopic;


    /**
     * Constructor
     */
    public Medicine() {
    }

    /**
     * Construcotr w/ arguments
     * @param genericName
     * @param brandName
     * @param purpose
     * @param deaSch
     * @param special
     * @param category
     * @param studyTopic
     */
    public Medicine(String genericName, String brandName, String purpose, String deaSch, String special,
                    String category, String studyTopic) {
        this.genericName = genericName;
        this.brandName = brandName;
        this.purpose = purpose;
        this.deaSch = deaSch;
        this.special = special;
        this.category = category;
        this.studyTopic = studyTopic;
    }

    // getters

    /**
     * Get generic name
     * @return String - generic name
     */
    public String getGenericName() {
        return genericName;
    }

    /**
     * Get Brand Name
     * @return String - Brand Name
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Get Purpose
     * @return String - Purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Get DeaSch
     * @return String - DeaSch
     */
    public String getDeaSch() {
        return deaSch;
    }

    /**
     * Get Special
     * @return String - Special
     */
    public String getSpecial() {
        return special;
    }

    /**
     * Get Category
     * @return String - Category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Get Study Topic
     * @return String - Study Topic
     */
    public String getStudyTopic() {
        return studyTopic;
    }

    // setters

    /**
     * Set Generic name
     * @param genericName
     */
    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    /**
     * Set brand name
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Set purpose
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * Set DeaSch
     * @param deaSch
     */
    public void setDeaSch(String deaSch) {
        this.deaSch = deaSch;
    }

    /**
     * Set Special
     * @param special
     */
    public void setSpecial(String special) {
        this.special = special;
    }

    /**
     * Set Category
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Set Study Topic
     * @param studyTopic
     */
    public void setStudyTopic(String studyTopic) {
        this.studyTopic = studyTopic;
    }

    public String[] toStringArray(){
        String[] arr = new String[6];
        arr[0] = "Brand name\n" + brandName;
        arr[1] = "Purepose\n" + purpose;
        arr[2] = "DeaSch\n" + deaSch;
        arr[3] = "Special\n" + special;
        arr[4] = "Category\n" + category;
        arr[5] = "Study topic\n" + studyTopic;
        return arr;
    }
}
