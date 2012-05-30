
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InsertSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertSheet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="SheetType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IsWaste" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MarkList" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="SheetFormat" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SheetUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IncludeInBundleItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LayoutRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="RunListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertSheet")
public class InsertSheet
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "SheetType")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetType;
    @XmlAttribute(name = "IsWaste")
    protected Boolean isWaste;
    @XmlAttribute(name = "MarkList")
    protected List<String> markLists;
    @XmlAttribute(name = "SheetFormat")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sheetFormat;
    @XmlAttribute(name = "SheetUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetUsage;
    @XmlAttribute(name = "IncludeInBundleItem")
    @XmlSchemaType(name = "anySimpleType")
    protected String includeInBundleItem;
    @XmlAttribute(name = "LayoutRef")
    @XmlIDREF
    protected Object layoutRef;
    @XmlAttribute(name = "RunListRef")
    @XmlIDREF
    protected Object runListRef;

    /**
     * Gets the value of the sheetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetType() {
        return sheetType;
    }

    /**
     * Sets the value of the sheetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetType(String value) {
        this.sheetType = value;
    }

    /**
     * Gets the value of the isWaste property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsWaste() {
        return isWaste;
    }

    /**
     * Sets the value of the isWaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaste(Boolean value) {
        this.isWaste = value;
    }

    /**
     * Gets the value of the markLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarkLists() {
        if (markLists == null) {
            markLists = new ArrayList<String>();
        }
        return this.markLists;
    }

    /**
     * Gets the value of the sheetFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetFormat() {
        return sheetFormat;
    }

    /**
     * Sets the value of the sheetFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetFormat(String value) {
        this.sheetFormat = value;
    }

    /**
     * Gets the value of the sheetUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetUsage() {
        return sheetUsage;
    }

    /**
     * Sets the value of the sheetUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetUsage(String value) {
        this.sheetUsage = value;
    }

    /**
     * Gets the value of the includeInBundleItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeInBundleItem() {
        return includeInBundleItem;
    }

    /**
     * Sets the value of the includeInBundleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeInBundleItem(String value) {
        this.includeInBundleItem = value;
    }

    /**
     * Gets the value of the layoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLayoutRef() {
        return layoutRef;
    }

    /**
     * Sets the value of the layoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLayoutRef(Object value) {
        this.layoutRef = value;
    }

    /**
     * Gets the value of the runListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRunListRef() {
        return runListRef;
    }

    /**
     * Sets the value of the runListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRunListRef(Object value) {
        this.runListRef = value;
    }

}
