
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CuttingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CuttingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}CutBlock" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Cut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="NUpSeparation" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuttingParams", propOrder = {
    "cuts",
    "cutBlocks"
})
public class CuttingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Cut")
    protected List<Cut> cuts;
    @XmlElement(name = "CutBlock")
    protected List<CutBlock> cutBlocks;
    @XmlAttribute(name = "NUpSeparation")
    protected List<Double> nUpSeparations;

    /**
     * Gets the value of the cuts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cut }
     * 
     * 
     */
    public List<Cut> getCuts() {
        if (cuts == null) {
            cuts = new ArrayList<Cut>();
        }
        return this.cuts;
    }

    /**
     * Gets the value of the cutBlocks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutBlocks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutBlocks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutBlock }
     * 
     * 
     */
    public List<CutBlock> getCutBlocks() {
        if (cutBlocks == null) {
            cutBlocks = new ArrayList<CutBlock>();
        }
        return this.cutBlocks;
    }

    /**
     * Gets the value of the nUpSeparations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nUpSeparations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNUpSeparations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getNUpSeparations() {
        if (nUpSeparations == null) {
            nUpSeparations = new ArrayList<Double>();
        }
        return this.nUpSeparations;
    }

}
