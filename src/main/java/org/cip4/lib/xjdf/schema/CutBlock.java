
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CutBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutBlock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="BlockSubdivision" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="AssemblyIDs" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="BlockType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BlockElementSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="CutWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="BlockSize" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="BlockTrf" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="BlockElementType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutBlock")
public class CutBlock
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "BlockSubdivision")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair blockSubdivision;
    @XmlAttribute(name = "AssemblyIDs")
    protected List<String> assemblyIDs;
    @XmlAttribute(name = "BlockType")
    @XmlSchemaType(name = "anySimpleType")
    protected String blockType;
    @XmlAttribute(name = "BlockElementSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair blockElementSize;
    @XmlAttribute(name = "CutWidth")
    protected Double cutWidth;
    @XmlAttribute(name = "BlockSize")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair blockSize;
    @XmlAttribute(name = "BlockTrf")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix blockTrf;
    @XmlAttribute(name = "BlockElementType")
    @XmlSchemaType(name = "anySimpleType")
    protected String blockElementType;

    /**
     * Gets the value of the blockSubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getBlockSubdivision() {
        return blockSubdivision;
    }

    /**
     * Sets the value of the blockSubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockSubdivision(org.cip4.lib.xjdf.type.XYPair value) {
        this.blockSubdivision = value;
    }

    /**
     * Gets the value of the assemblyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssemblyIDs() {
        if (assemblyIDs == null) {
            assemblyIDs = new ArrayList<String>();
        }
        return this.assemblyIDs;
    }

    /**
     * Gets the value of the blockType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * Sets the value of the blockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockType(String value) {
        this.blockType = value;
    }

    /**
     * Gets the value of the blockElementSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getBlockElementSize() {
        return blockElementSize;
    }

    /**
     * Sets the value of the blockElementSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockElementSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.blockElementSize = value;
    }

    /**
     * Gets the value of the cutWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCutWidth() {
        return cutWidth;
    }

    /**
     * Sets the value of the cutWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCutWidth(Double value) {
        this.cutWidth = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockSize(org.cip4.lib.xjdf.type.XYPair value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the blockTrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Matrix getBlockTrf() {
        return blockTrf;
    }

    /**
     * Sets the value of the blockTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockTrf(org.cip4.lib.xjdf.type.Matrix value) {
        this.blockTrf = value;
    }

    /**
     * Gets the value of the blockElementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockElementType() {
        return blockElementType;
    }

    /**
     * Sets the value of the blockElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockElementType(String value) {
        this.blockElementType = value;
    }

}
