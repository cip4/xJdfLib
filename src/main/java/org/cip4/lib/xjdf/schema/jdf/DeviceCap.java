
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BooleanState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}StringState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}EnumState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}XYPairState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DateTimeState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MacroPool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ActionPool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PDFPathState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RectangleState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}NumberState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}IntegerState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DurationState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}NameState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ModulePool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Performance" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MatrixState" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TestPool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ElementState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Lang" type="{http://www.CIP4.org/JDFSchema_2_0}languages" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "elementStates",
    "testPools",
    "matrixStates",
    "performances",
    "modulePools",
    "nameStates",
    "durationStates",
    "integerStates",
    "numberStates",
    "rectangleStates",
    "pdfPathStates",
    "actionPools",
    "shapeStates",
    "macroPools",
    "dateTimeStates",
    "xyPairStates",
    "enumStates",
    "stringStates",
    "booleanStates"
})
@XmlRootElement(name = "DeviceCap")
public class DeviceCap
    implements Serializable
{

    @XmlElement(name = "ElementState")
    protected List<ElementState> elementStates;
    @XmlElement(name = "TestPool")
    protected List<TestPool> testPools;
    @XmlElement(name = "MatrixState")
    protected List<MatrixState> matrixStates;
    @XmlElement(name = "Performance")
    protected List<Performance> performances;
    @XmlElement(name = "ModulePool")
    protected List<ModulePool> modulePools;
    @XmlElement(name = "NameState")
    protected List<NameState> nameStates;
    @XmlElement(name = "DurationState")
    protected List<DurationState> durationStates;
    @XmlElement(name = "IntegerState")
    protected List<IntegerState> integerStates;
    @XmlElement(name = "NumberState")
    protected List<NumberState> numberStates;
    @XmlElement(name = "RectangleState")
    protected List<RectangleState> rectangleStates;
    @XmlElement(name = "PDFPathState")
    protected List<PDFPathState> pdfPathStates;
    @XmlElement(name = "ActionPool")
    protected List<ActionPool> actionPools;
    @XmlElement(name = "ShapeState")
    protected List<ShapeState> shapeStates;
    @XmlElement(name = "MacroPool")
    protected List<MacroPool> macroPools;
    @XmlElement(name = "DateTimeState")
    protected List<DateTimeState> dateTimeStates;
    @XmlElement(name = "XYPairState")
    protected List<XYPairState> xyPairStates;
    @XmlElement(name = "EnumState")
    protected List<EnumState> enumStates;
    @XmlElement(name = "StringState")
    protected List<StringState> stringStates;
    @XmlElement(name = "BooleanState")
    protected List<BooleanState> booleanStates;
    @XmlAttribute(name = "Lang")
    protected List<String> langs;

    /**
     * Gets the value of the elementStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementState }
     * 
     * 
     */
    public List<ElementState> getElementStates() {
        if (elementStates == null) {
            elementStates = new ArrayList<ElementState>();
        }
        return this.elementStates;
    }

    /**
     * Gets the value of the testPools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPool }
     * 
     * 
     */
    public List<TestPool> getTestPools() {
        if (testPools == null) {
            testPools = new ArrayList<TestPool>();
        }
        return this.testPools;
    }

    /**
     * Gets the value of the matrixStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixState }
     * 
     * 
     */
    public List<MatrixState> getMatrixStates() {
        if (matrixStates == null) {
            matrixStates = new ArrayList<MatrixState>();
        }
        return this.matrixStates;
    }

    /**
     * Gets the value of the performances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Performance }
     * 
     * 
     */
    public List<Performance> getPerformances() {
        if (performances == null) {
            performances = new ArrayList<Performance>();
        }
        return this.performances;
    }

    /**
     * Gets the value of the modulePools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulePools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulePools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModulePool }
     * 
     * 
     */
    public List<ModulePool> getModulePools() {
        if (modulePools == null) {
            modulePools = new ArrayList<ModulePool>();
        }
        return this.modulePools;
    }

    /**
     * Gets the value of the nameStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameState }
     * 
     * 
     */
    public List<NameState> getNameStates() {
        if (nameStates == null) {
            nameStates = new ArrayList<NameState>();
        }
        return this.nameStates;
    }

    /**
     * Gets the value of the durationStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durationStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurationStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DurationState }
     * 
     * 
     */
    public List<DurationState> getDurationStates() {
        if (durationStates == null) {
            durationStates = new ArrayList<DurationState>();
        }
        return this.durationStates;
    }

    /**
     * Gets the value of the integerStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerState }
     * 
     * 
     */
    public List<IntegerState> getIntegerStates() {
        if (integerStates == null) {
            integerStates = new ArrayList<IntegerState>();
        }
        return this.integerStates;
    }

    /**
     * Gets the value of the numberStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberState }
     * 
     * 
     */
    public List<NumberState> getNumberStates() {
        if (numberStates == null) {
            numberStates = new ArrayList<NumberState>();
        }
        return this.numberStates;
    }

    /**
     * Gets the value of the rectangleStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rectangleStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRectangleStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RectangleState }
     * 
     * 
     */
    public List<RectangleState> getRectangleStates() {
        if (rectangleStates == null) {
            rectangleStates = new ArrayList<RectangleState>();
        }
        return this.rectangleStates;
    }

    /**
     * Gets the value of the pdfPathStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfPathStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFPathStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFPathState }
     * 
     * 
     */
    public List<PDFPathState> getPDFPathStates() {
        if (pdfPathStates == null) {
            pdfPathStates = new ArrayList<PDFPathState>();
        }
        return this.pdfPathStates;
    }

    /**
     * Gets the value of the actionPools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionPools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionPools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionPool }
     * 
     * 
     */
    public List<ActionPool> getActionPools() {
        if (actionPools == null) {
            actionPools = new ArrayList<ActionPool>();
        }
        return this.actionPools;
    }

    /**
     * Gets the value of the shapeStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeState }
     * 
     * 
     */
    public List<ShapeState> getShapeStates() {
        if (shapeStates == null) {
            shapeStates = new ArrayList<ShapeState>();
        }
        return this.shapeStates;
    }

    /**
     * Gets the value of the macroPools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macroPools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacroPools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MacroPool }
     * 
     * 
     */
    public List<MacroPool> getMacroPools() {
        if (macroPools == null) {
            macroPools = new ArrayList<MacroPool>();
        }
        return this.macroPools;
    }

    /**
     * Gets the value of the dateTimeStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeState }
     * 
     * 
     */
    public List<DateTimeState> getDateTimeStates() {
        if (dateTimeStates == null) {
            dateTimeStates = new ArrayList<DateTimeState>();
        }
        return this.dateTimeStates;
    }

    /**
     * Gets the value of the xyPairStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xyPairStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXYPairStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XYPairState }
     * 
     * 
     */
    public List<XYPairState> getXYPairStates() {
        if (xyPairStates == null) {
            xyPairStates = new ArrayList<XYPairState>();
        }
        return this.xyPairStates;
    }

    /**
     * Gets the value of the enumStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumState }
     * 
     * 
     */
    public List<EnumState> getEnumStates() {
        if (enumStates == null) {
            enumStates = new ArrayList<EnumState>();
        }
        return this.enumStates;
    }

    /**
     * Gets the value of the stringStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringState }
     * 
     * 
     */
    public List<StringState> getStringStates() {
        if (stringStates == null) {
            stringStates = new ArrayList<StringState>();
        }
        return this.stringStates;
    }

    /**
     * Gets the value of the booleanStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BooleanState }
     * 
     * 
     */
    public List<BooleanState> getBooleanStates() {
        if (booleanStates == null) {
            booleanStates = new ArrayList<BooleanState>();
        }
        return this.booleanStates;
    }

    /**
     * Gets the value of the langs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the langs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLangs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLangs() {
        if (langs == null) {
            langs = new ArrayList<String>();
        }
        return this.langs;
    }

}
