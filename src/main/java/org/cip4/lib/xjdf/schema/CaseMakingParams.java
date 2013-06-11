
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CaseMakingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseMakingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TopFoldIn" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="FrontFoldIn" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Height" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="JointWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="SpineWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BottomFoldIn" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="CornerType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="CoverWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseMakingParams", propOrder = {
    "glueLine"
})
public class CaseMakingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLine;
    @XmlAttribute(name = "TopFoldIn")
    protected Double topFoldIn;
    @XmlAttribute(name = "FrontFoldIn")
    protected Double frontFoldIn;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "JointWidth")
    protected Double jointWidth;
    @XmlAttribute(name = "SpineWidth")
    protected Double spineWidth;
    @XmlAttribute(name = "BottomFoldIn")
    protected Double bottomFoldIn;
    @XmlAttribute(name = "CornerType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cornerType;
    @XmlAttribute(name = "CoverWidth")
    protected Double coverWidth;

    /**
     * Gets the value of the glueLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLine() {
        if (glueLine == null) {
            glueLine = new ArrayList<GlueLine>();
        }
        return this.glueLine;
    }

    /**
     * Gets the value of the topFoldIn property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopFoldIn() {
        return topFoldIn;
    }

    /**
     * Sets the value of the topFoldIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopFoldIn(Double value) {
        this.topFoldIn = value;
    }

    /**
     * Gets the value of the frontFoldIn property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrontFoldIn() {
        return frontFoldIn;
    }

    /**
     * Sets the value of the frontFoldIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrontFoldIn(Double value) {
        this.frontFoldIn = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the jointWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJointWidth() {
        return jointWidth;
    }

    /**
     * Sets the value of the jointWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJointWidth(Double value) {
        this.jointWidth = value;
    }

    /**
     * Gets the value of the spineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpineWidth() {
        return spineWidth;
    }

    /**
     * Sets the value of the spineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpineWidth(Double value) {
        this.spineWidth = value;
    }

    /**
     * Gets the value of the bottomFoldIn property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBottomFoldIn() {
        return bottomFoldIn;
    }

    /**
     * Sets the value of the bottomFoldIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottomFoldIn(Double value) {
        this.bottomFoldIn = value;
    }

    /**
     * Gets the value of the cornerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCornerType() {
        return cornerType;
    }

    /**
     * Sets the value of the cornerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCornerType(String value) {
        this.cornerType = value;
    }

    /**
     * Gets the value of the coverWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoverWidth() {
        return coverWidth;
    }

    /**
     * Sets the value of the coverWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoverWidth(Double value) {
        this.coverWidth = value;
    }

}
