
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RelativeWorkingPath" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="WorkingPath" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="Depth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RelativeTravel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="RelativeStartPosition" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="WorkingDirection" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Travel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Crease")
public class Crease
    implements Serializable
{

    @XmlAttribute(name = "RelativeWorkingPath")
    protected List<Double> relativeWorkingPaths;
    @XmlAttribute(name = "StartPosition")
    protected List<Double> startPositions;
    @XmlAttribute(name = "WorkingPath")
    protected List<Double> workingPaths;
    @XmlAttribute(name = "Depth")
    protected Double depth;
    @XmlAttribute(name = "RelativeTravel")
    protected Double relativeTravel;
    @XmlAttribute(name = "RelativeStartPosition")
    protected List<Double> relativeStartPositions;
    @XmlAttribute(name = "WorkingDirection")
    @XmlSchemaType(name = "anySimpleType")
    protected String workingDirection;
    @XmlAttribute(name = "Travel")
    protected Double travel;

    /**
     * Gets the value of the relativeWorkingPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeWorkingPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeWorkingPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRelativeWorkingPaths() {
        if (relativeWorkingPaths == null) {
            relativeWorkingPaths = new ArrayList<Double>();
        }
        return this.relativeWorkingPaths;
    }

    /**
     * Gets the value of the startPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getStartPositions() {
        if (startPositions == null) {
            startPositions = new ArrayList<Double>();
        }
        return this.startPositions;
    }

    /**
     * Gets the value of the workingPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getWorkingPaths() {
        if (workingPaths == null) {
            workingPaths = new ArrayList<Double>();
        }
        return this.workingPaths;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepth(Double value) {
        this.depth = value;
    }

    /**
     * Gets the value of the relativeTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelativeTravel() {
        return relativeTravel;
    }

    /**
     * Sets the value of the relativeTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelativeTravel(Double value) {
        this.relativeTravel = value;
    }

    /**
     * Gets the value of the relativeStartPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeStartPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeStartPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRelativeStartPositions() {
        if (relativeStartPositions == null) {
            relativeStartPositions = new ArrayList<Double>();
        }
        return this.relativeStartPositions;
    }

    /**
     * Gets the value of the workingDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDirection() {
        return workingDirection;
    }

    /**
     * Sets the value of the workingDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDirection(String value) {
        this.workingDirection = value;
    }

    /**
     * Gets the value of the travel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTravel() {
        return travel;
    }

    /**
     * Sets the value of the travel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTravel(Double value) {
        this.travel = value;
    }

}
