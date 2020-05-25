package student;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.omg.PortableServer.THREAD_POLICY_ID;

import javax.xml.soap.Text;

public class RegisterForm {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private VBox mainPane;
    private HBox titleHBox;
    private Label titleLabel;

    private VBox firstDivision;

    private HBox firstLayer;
    private Label firstLayerInfoLabel;
    private TextField firstNameTextField;
    private TextField middleNameTextField;
    private TextField lastNameTextField;

    private HBox secondLayer;
    private DatePicker dateOfBirthDatePicker;
    private TextField placeOfBirthTextField;
    private TextField ageTextField;

    private HBox thirdLayer;
    private Label genderLabel;
    private ToggleGroup genderRadioButtonToggleGroup;
    private RadioButton maleRadioButton;
    private RadioButton femaleRadioButton;

    private HBox fourthLayer;
    private TextField addressTextField;
    private TextField postalCodeTextField;

    private HBox fifthLayer;
    private TextField emailAddressTextField;
    private TextField mobilePhoneTextField;

    private VBox secondDivision;

    private HBox sixthLayer;
    private Label sixthLayerInfoLabel;

    private VBox fatherVBox;
    private Label fatherLabel;
    private TextField fatherFullNameTextField;
    private TextField fatherProfessionTextField;
    private TextField fatherTelephoneTextField;

    private VBox motherVBox;
    private Label motherLabel;
    private TextField motherFullNameTextField;
    private TextField motherProfessionTextField;
    private TextField motherTelephoneTextField;

    private VBox thirdDivision;

    private HBox seventhLayer;
    private Label seventhLayerInfoLabel;

    private TextField emergencyFirstNameTextField;
    private TextField emergencyMiddleNameTextField;
    private TextField emergencyLastNameTextField;

    private HBox eightLayer;
    private TextField emergencyCellPhoneTextField;

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainBorderPane.setCenter(createMainPane());

        mainScene = new Scene(mainBorderPane, window.getWidth(), window.getHeight());
        mainScene.getStylesheets().add("css/student/register/StudentRegister.css");

        return mainScene;
    }

    private HBox createEightLayer() {
        eightLayer = new HBox();

        emergencyCellPhoneTextField = new TextField();
        emergencyCellPhoneTextField.setPromptText("Cellphone Number");

        eightLayer.getChildren().add(emergencyCellPhoneTextField);

        return eightLayer;
    }

    private HBox createSeventhLayer() {
        seventhLayer = new HBox();

        emergencyFirstNameTextField = new TextField();
        emergencyFirstNameTextField.setPromptText("First Name");

        emergencyMiddleNameTextField = new TextField();
        emergencyMiddleNameTextField.setPromptText("Middle Name");

        emergencyLastNameTextField = new TextField();
        emergencyLastNameTextField.setPromptText("Last Name");

        seventhLayer.getChildren().addAll(emergencyFirstNameTextField,
                emergencyMiddleNameTextField,
                emergencyLastNameTextField);

        return seventhLayer;
    }

    private VBox createThirdDivision() {
        thirdDivision = new VBox();

        seventhLayerInfoLabel = new Label("III. Emergency Contact");

        thirdDivision.getChildren().addAll(seventhLayerInfoLabel, createSeventhLayer(), createEightLayer());

        return thirdDivision;
    }

    private VBox createMotherVBox() {
        motherVBox = new VBox();

        motherLabel = new Label("Mother");

        motherFullNameTextField = new TextField();
        motherFullNameTextField.setPromptText("Full Name");

        motherProfessionTextField = new TextField();
        motherProfessionTextField.setPromptText("Profession");

        motherTelephoneTextField = new TextField();
        motherTelephoneTextField.setPromptText("Telephone");

        motherVBox.getChildren().addAll(motherLabel,
                motherFullNameTextField,
                motherProfessionTextField,
                motherTelephoneTextField);

        return motherVBox;
    }

    private VBox createFatherVBox() {
        fatherVBox = new VBox();

        fatherLabel = new Label("Father");

        fatherFullNameTextField = new TextField();
        fatherFullNameTextField.setPromptText("Full Name");

        fatherProfessionTextField = new TextField();
        fatherProfessionTextField.setPromptText("Profession");

        fatherTelephoneTextField = new TextField();
        fatherTelephoneTextField.setPromptText("Telephone");

        fatherVBox.getChildren().addAll(fatherLabel,
                fatherFullNameTextField,
                fatherProfessionTextField,
                fatherTelephoneTextField);

        return fatherVBox;
    }

    private HBox createSixthLayer() {
        sixthLayer = new HBox();

        sixthLayer.getChildren().addAll(createFatherVBox(), createMotherVBox());

        return sixthLayer;
    }

    private VBox createSecondDivision() {
        secondDivision = new VBox();

        sixthLayerInfoLabel = new Label("II. Parents Information");

        secondDivision.getChildren().addAll(sixthLayerInfoLabel,
                createSixthLayer());

        return secondDivision;
    }

    private HBox createFifthLayer() {
        fifthLayer = new HBox();

        emailAddressTextField = new TextField();
        emailAddressTextField.setPromptText("Email Address");

        mobilePhoneTextField = new TextField();
        mobilePhoneTextField.setPromptText("Phone Number");

        fifthLayer.getChildren().addAll(emailAddressTextField, mobilePhoneTextField);

        return fifthLayer;
    }

    private HBox createFourthLayer() {
        fourthLayer = new HBox();

        addressTextField = new TextField();
        addressTextField.setPromptText("Address");

        postalCodeTextField = new TextField();
        postalCodeTextField.setPromptText("Postal Code");

        fourthLayer.getChildren().addAll(addressTextField, postalCodeTextField);

        return fourthLayer;
    }

    private HBox createThirdLayer() {
        thirdLayer = new HBox();

        genderLabel = new Label("Gender:");

        genderRadioButtonToggleGroup = new ToggleGroup();

        maleRadioButton = new RadioButton("Male");

        femaleRadioButton = new RadioButton("Females");

        maleRadioButton.setToggleGroup(genderRadioButtonToggleGroup);
        femaleRadioButton.setToggleGroup(genderRadioButtonToggleGroup);

        thirdLayer.getChildren().addAll(genderLabel, maleRadioButton, femaleRadioButton);

        return thirdLayer;
    }

    private HBox createSecondLayer() {
        secondLayer = new HBox();

        dateOfBirthDatePicker = new DatePicker();

        placeOfBirthTextField = new TextField();
        placeOfBirthTextField.setPromptText("Place of Birth");

        ageTextField = new TextField();
        ageTextField.setPromptText("Age");

        secondLayer.getChildren().addAll(dateOfBirthDatePicker, placeOfBirthTextField, ageTextField);

        return secondLayer;
    }

    private HBox createFirstLayer() {
        firstLayer = new HBox();

        firstNameTextField = new TextField();
        firstNameTextField.setPromptText("First Name");

        middleNameTextField = new TextField();
        middleNameTextField.setPromptText("Middle Name");

        lastNameTextField = new TextField();
        lastNameTextField.setPromptText("Last Name");

        firstLayer.getChildren().addAll(firstNameTextField, middleNameTextField, lastNameTextField);

        return firstLayer;
    }

    private VBox createFirstDivision() {
        firstDivision = new VBox();

        firstLayerInfoLabel = new Label("I. Student Information");

        firstDivision.getChildren().addAll(firstLayerInfoLabel,
                createFirstLayer(),
                createSecondLayer(),
                createThirdLayer(),
                createFourthLayer(),
                createFifthLayer());

        return firstDivision;
    }

    private HBox createTitle() {
        titleHBox = new HBox();
        titleHBox.setId("title");

        titleLabel = new Label("Student Register");

        titleHBox.getChildren().add(titleLabel);

        return titleHBox;
    }

    private VBox createMainPane() {
        mainPane = new VBox();
        mainPane.setId("main");

        mainPane.getChildren().addAll(
                createTitle(),
                createFirstDivision(),
                createSecondDivision(),
                createThirdDivision());

        return mainPane;
    }
}
