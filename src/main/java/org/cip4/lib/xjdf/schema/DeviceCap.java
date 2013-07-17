
package org.cip4.lib.xjdf.schema;

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
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BooleanState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}StringState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}EnumState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}XYPairState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DateTimeState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MacroPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ActionPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}PDFPathState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}RectangleState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}NumberState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}IntegerState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}DurationState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}NameState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ModulePool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Performance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MatrixState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TestPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ElementState" maxOccurs="unbounded" minOccurs="0"/>
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
    "booleanState",
    "stringState",
    "enumState",
    "xyPairState",
    "dateTimeState",
    "macroPool",
    "shapeState",
    "actionPool",
    "pdfPathState",
    "rectangleState",
    "numberState",
    "integerState",
    "durationState",
    "nameState",
    "modulePool",
    "performance",
    "matrixState",
    "testPool",
    "elementState"
})
@XmlRootElement(name = "DeviceCap")
public class DeviceCap
    implements Serializable
{

    @XmlElement(name = "BooleanState")
    protected List<BooleanState> booleanState;
    @XmlElement(name = "StringState")
    protected List<StringState> stringState;
    @XmlElement(name = "EnumState")
    protected List<EnumState> enumState;
    @XmlElement(name = "XYPairState")
    protected List<XYPairState> xyPairState;
    @XmlElement(name = "DateTimeState")
    protected List<DateTimeState> dateTimeState;
    @XmlElement(name = "MacroPool")
    protected List<MacroPool> macroPool;
    @XmlElement(name = "ShapeState")
    protected List<ShapeState> shapeState;
    @XmlElement(name = "ActionPool")
    protected List<ActionPool> actionPool;
    @XmlElement(name = "PDFPathState")
    protected List<PDFPathState> pdfPathState;
    @XmlElement(name = "RectangleState")
    protected List<RectangleState> rectangleState;
    @XmlElement(name = "NumberState")
    protected List<NumberState> numberState;
    @XmlElement(name = "IntegerState")
    protected List<IntegerState> integerState;
    @XmlElement(name = "DurationState")
    protected List<DurationState> durationState;
    @XmlElement(name = "NameState")
    protected List<NameState> nameState;
    @XmlElement(name = "ModulePool")
    protected List<ModulePool> modulePool;
    @XmlElement(name = "Performance")
    protected List<Performance> performance;
    @XmlElement(name = "MatrixState")
    protected List<MatrixState> matrixState;
    @XmlElement(name = "TestPool")
    protected List<TestPool> testPool;
    @XmlElement(name = "ElementState")
    protected List<ElementState> elementState;
    @XmlAttribute(name = "Lang")
    protected List<String> lang;

    /**
     * Gets the value of the booleanState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BooleanState }
     * 
     * 
     */
    public List<BooleanState> getBooleanState() {
        if (booleanState == null) {
            booleanState = new ArrayList<BooleanState>();
        }
        return this.booleanState;
    }

    /**
     * Gets the value of the stringState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringState }
     * 
     * 
     */
    public List<StringState> getStringState() {
        if (stringState == null) {
            stringState = new ArrayList<StringState>();
        }
        return this.stringState;
    }

    /**
     * Gets the value of the enumState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumState }
     * 
     * 
     */
    public List<EnumState> getEnumState() {
        if (enumState == null) {
            enumState = new ArrayList<EnumState>();
        }
        return this.enumState;
    }

    /**
     * Gets the value of the xyPairState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xyPairState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXYPairState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XYPairState }
     * 
     * 
     */
    public List<XYPairState> getXYPairState() {
        if (xyPairState == null) {
            xyPairState = new ArrayList<XYPairState>();
        }
        return this.xyPairState;
    }

    /**
     * Gets the value of the dateTimeState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeState }
     * 
     * 
     */
    public List<DateTimeState> getDateTimeState() {
        if (dateTimeState == null) {
            dateTimeState = new ArrayList<DateTimeState>();
        }
        return this.dateTimeState;
    }

    /**
     * Gets the value of the macroPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macroPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacroPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MacroPool }
     * 
     * 
     */
    public List<MacroPool> getMacroPool() {
        if (macroPool == null) {
            macroPool = new ArrayList<MacroPool>();
        }
        return this.macroPool;
    }

    /**
     * Gets the value of the shapeState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeState }
     * 
     * 
     */
    public List<ShapeState> getShapeState() {
        if (shapeState == null) {
            shapeState = new ArrayList<ShapeState>();
        }
        return this.shapeState;
    }

    /**
     * Gets the value of the actionPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionPool }
     * 
     * 
     */
    public List<ActionPool> getActionPool() {
        if (actionPool == null) {
            actionPool = new ArrayList<ActionPool>();
        }
        return this.actionPool;
    }

    /**
     * Gets the value of the pdfPathState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfPathState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFPathState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFPathState }
     * 
     * 
     */
    public List<PDFPathState> getPDFPathState() {
        if (pdfPathState == null) {
            pdfPathState = new ArrayList<PDFPathState>();
        }
        return this.pdfPathState;
    }

    /**
     * Gets the value of the rectangleState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rectangleState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRectangleState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RectangleState }
     * 
     * 
     */
    public List<RectangleState> getRectangleState() {
        if (rectangleState == null) {
            rectangleState = new ArrayList<RectangleState>();
        }
        return this.rectangleState;
    }

    /**
     * Gets the value of the numberState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberState }
     * 
     * 
     */
    public List<NumberState> getNumberState() {
        if (numberState == null) {
            numberState = new ArrayList<NumberState>();
        }
        return this.numberState;
    }

    /**
     * Gets the value of the integerState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerState }
     * 
     * 
     */
    public List<IntegerState> getIntegerState() {
        if (integerState == null) {
            integerState = new ArrayList<IntegerState>();
        }
        return this.integerState;
    }

    /**
     * Gets the value of the durationState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durationState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurationState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DurationState }
     * 
     * 
     */
    public List<DurationState> getDurationState() {
        if (durationState == null) {
            durationState = new ArrayList<DurationState>();
        }
        return this.durationState;
    }

    /**
     * Gets the value of the nameState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameState }
     * 
     * 
     */
    public List<NameState> getNameState() {
        if (nameState == null) {
            nameState = new ArrayList<NameState>();
        }
        return this.nameState;
    }

    /**
     * Gets the value of the modulePool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulePool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulePool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModulePool }
     * 
     * 
     */
    public List<ModulePool> getModulePool() {
        if (modulePool == null) {
            modulePool = new ArrayList<ModulePool>();
        }
        return this.modulePool;
    }

    /**
     * Gets the value of the performance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Performance }
     * 
     * 
     */
    public List<Performance> getPerformance() {
        if (performance == null) {
            performance = new ArrayList<Performance>();
        }
        return this.performance;
    }

    /**
     * Gets the value of the matrixState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixState }
     * 
     * 
     */
    public List<MatrixState> getMatrixState() {
        if (matrixState == null) {
            matrixState = new ArrayList<MatrixState>();
        }
        return this.matrixState;
    }

    /**
     * Gets the value of the testPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPool }
     * 
     * 
     */
    public List<TestPool> getTestPool() {
        if (testPool == null) {
            testPool = new ArrayList<TestPool>();
        }
        return this.testPool;
    }

    /**
     * Gets the value of the elementState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementState }
     * 
     * 
     */
    public List<ElementState> getElementState() {
        if (elementState == null) {
            elementState = new ArrayList<ElementState>();
        }
        return this.elementState;
    }

    /**
     * Gets the value of the lang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLang() {
        if (lang == null) {
            lang = new ArrayList<String>();
        }
        return this.lang;
    }

}
