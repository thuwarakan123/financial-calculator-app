package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Financial Calculator");
        // creating tabpane
        TabPane calculator =new TabPane();

        // create tabs and add to tabpane
        Tab Compound_saving = new Tab("Compound Saving");

        //adding contents to our interface
        Label C_lb1 = new Label("Start Principal :");
          C_lb1.setLayoutX(60);
          C_lb1.setLayoutY(30);
          C_lb1.setStyle("-fx-font:bold 16px 'arialblack'");
        Label C_lb2 = new Label("Interest Rate :");
          C_lb2.setLayoutX(60);
          C_lb2.setLayoutY(90);
          C_lb2.setStyle("-fx-font:bold 16px 'arialblack'");
        Label C_lb3 = new Label("Terms(in years) :");
          C_lb3.setLayoutX(60);
          C_lb3.setLayoutY(150);
          C_lb3.setStyle("-fx-font:bold 16px 'arialblack'");
        Label C_lb4 = new Label("Future Value :");
          C_lb4.setLayoutX(60);
          C_lb4.setLayoutY(210);
          C_lb4.setStyle("-fx-font:bold 16px 'arialblack'");
        Label ans_1 = new Label();
          ans_1.setLayoutX(165);
          ans_1.setLayoutY(250);

        TextField C_amount = new TextField();
          C_amount.setLayoutX(230);
          C_amount.setLayoutY(28);
          C_amount.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField interest_1 = new TextField();
          interest_1.setLayoutX(230);
          interest_1.setLayoutY(88);
          interest_1.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField terms_1 = new TextField();
          terms_1.setLayoutX(230);
          terms_1.setLayoutY(148);
          terms_1.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField fut_1= new TextField();
          fut_1.setLayoutX(230);
          fut_1.setLayoutY(208);
          fut_1.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");

        Button calculate_1 = new Button("Calculate");
          calculate_1.setLayoutX(350);
          calculate_1.setLayoutY(300);
          calculate_1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                  "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");
        Button Keyboard_1 = new Button("Keyboard");
          Keyboard_1.setLayoutX(40);
          Keyboard_1.setLayoutY(300);
          Keyboard_1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;-fx-padding:12px;" +
                  "-fx-font:bold 20px 'arialblack'");

        Pane base_1 = new Pane();
          base_1.setStyle("-fx-background-color:lightblue;");
        base_1.getChildren().addAll(C_lb2,C_lb3,C_lb4,interest_1,fut_1,terms_1,ans_1,calculate_1,Keyboard_1,C_lb1,C_amount);
        Compound_saving.setContent(base_1);
        //----------------------------------------------------------------------------------------
        Tab Saving = new Tab("Saving");

        Label S_lb1 = new Label("Start Principal :\n\n(Starting Principal only for future value calculation)");
          S_lb1.setLayoutX(60);
          S_lb1.setLayoutY(170);
          S_lb1.setStyle("-fx-font:bold 16px 'arialblack'");
        Label S_lb2 = new Label("Interest Rate :");
          S_lb2.setLayoutX(60);
          S_lb2.setLayoutY(10);
          S_lb2.setStyle("-fx-font:bold 16px 'arialblack'");
        Label S_lb3 = new Label("Terms(in years) :");
          S_lb3.setLayoutX(60);
          S_lb3.setLayoutY(50);
          S_lb3.setStyle("-fx-font:bold 16px 'arialblack'");
        Label S_lb4 = new Label("PMT :");
          S_lb4.setLayoutX(60);
          S_lb4.setLayoutY(90);
          S_lb4.setStyle("-fx-font:bold 16px 'arialblack'");
        Label S_lb5 = new Label("Future Value :");
          S_lb5.setLayoutX(60);
          S_lb5.setLayoutY(130);
          S_lb5.setStyle("-fx-font:bold 16px 'arialblack'");
        Label ans_2 = new Label();
          ans_2.setLayoutX(120);
          ans_2.setLayoutY(250);


        TextField S_amount = new TextField();
          S_amount.setLayoutX(230);
          S_amount.setLayoutY(168);
          S_amount.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField interest_2 = new TextField();
          interest_2.setLayoutX(230);
          interest_2.setLayoutY(8);
          interest_2.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField terms_2 = new TextField();
          terms_2.setLayoutX(230);
          terms_2.setLayoutY(48);
          terms_2.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField pmt_2= new TextField();
          pmt_2.setLayoutX(230);
          pmt_2.setLayoutY(88);
          pmt_2.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField fut_2= new TextField();
          fut_2.setLayoutX(230);
          fut_2.setLayoutY(128);
          fut_2.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");

        Button calculate_2 = new Button("Calculate");
          calculate_2.setLayoutX(350);
          calculate_2.setLayoutY(300);
          calculate_2.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");
        Button Keyboard_2 = new Button("Keyboard");
          Keyboard_2.setLayoutX(40);
          Keyboard_2.setLayoutY(300);
          Keyboard_2.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");

        Pane base_2 = new Pane();
          base_2.setStyle("-fx-background-color:lightblue;");
        base_2.getChildren().addAll( S_lb2,S_lb3,S_lb4,S_lb5 ,interest_2,pmt_2,terms_2,ans_2,fut_2,calculate_2,Keyboard_2,S_lb1,S_amount);
        Saving.setContent(base_2);
        //-----------------------------------------------------------------------------------------
        Tab Loans = new Tab("Loan");

        Label L_lb1 = new Label("Loan Amount :");
          L_lb1.setLayoutX(60);
          L_lb1.setLayoutY(30);
          L_lb1.setStyle("-fx-font:bold 16px 'arialblack'");
        Label L_lb2 = new Label("Interest Rate :");
          L_lb2.setLayoutX(60);
          L_lb2.setLayoutY(90);
          L_lb2.setStyle("-fx-font:bold 16px 'arialblack'");
        Label L_lb3 = new Label("Loan Terms(in years) :");
          L_lb3.setLayoutX(60);
          L_lb3.setLayoutY(150);
          L_lb3.setStyle("-fx-font:bold 16px 'arialblack'");
        Label L_lb4 = new Label("PMT :");
          L_lb4.setLayoutX(60);
          L_lb4.setLayoutY(210);
          L_lb4.setStyle("-fx-font:bold 16px 'arialblack'");
        Label ans_3 = new Label();
          ans_3.setLayoutX(115);
          ans_3.setLayoutY(250);

        TextField L_amount = new TextField();
          L_amount.setLayoutX(230);
          L_amount.setLayoutY(28);
          L_amount.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField interest_3 = new TextField();
          interest_3.setLayoutX(230);
          interest_3.setLayoutY(88);
          interest_3.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField terms_3 = new TextField();
          terms_3.setLayoutX(230);
          terms_3.setLayoutY(148);
          terms_3.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField pmt_3= new TextField();
          pmt_3.setLayoutX(230);
          pmt_3.setLayoutY(208);
          pmt_3.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");

        Button calculate_3 = new Button("Calculate");
          calculate_3.setLayoutX(350);
          calculate_3.setLayoutY(300);
          calculate_3.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");
        Button Keyboard_3 = new Button("Keyboard");
          Keyboard_3.setLayoutX(40);
          Keyboard_3.setLayoutY(300);
          Keyboard_3.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");

        Pane base_3 = new Pane();
          base_3.setStyle("-fx-background-color:lightblue;");
        base_3.getChildren().addAll(L_lb1,L_lb2,L_lb3,L_lb4,L_amount,interest_3,pmt_3,terms_3,ans_3,calculate_3,Keyboard_3);
        Loans.setContent(base_3);
        //-------------------------------------------------------------------------------------------
        Tab Mortgage = new Tab("Mortgage");

        Label M_lb1 = new Label("Mortgage Price :");
           M_lb1.setLayoutX(40);
           M_lb1.setLayoutY(30);
           M_lb1.setStyle("-fx-font:bold 16px 'arialblack'");
        Label M_lb2 = new Label("Interest Rate :");
           M_lb2.setLayoutX(40);
           M_lb2.setLayoutY(90);
           M_lb2.setStyle("-fx-font:bold 16px 'arialblack'");
        Label M_lb3 = new Label("Mortgage Terms(in years) :");
           M_lb3.setLayoutX(40);
           M_lb3.setLayoutY(150);
           M_lb3.setStyle("-fx-font:bold 16px 'arialblack'");
        Label M_lb4 = new Label("PMT :");
           M_lb4.setLayoutX(40);
           M_lb4.setLayoutY(210);
           M_lb4.setStyle("-fx-font:bold 16px 'arialblack'");
        Label ans_4 = new Label();
           ans_4.setLayoutX(115);
           ans_4.setLayoutY(250);


        TextField M_amount = new TextField();
           M_amount.setLayoutX(270);
           M_amount.setLayoutY(28);
           M_amount.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField interest_4 = new TextField();
           interest_4.setLayoutX(270);
           interest_4.setLayoutY(88);
           interest_4.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField terms_4 = new TextField();
           terms_4.setLayoutX(270);
           terms_4.setLayoutY(148);
           terms_4.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");
        TextField pmt_4= new TextField();
           pmt_4.setLayoutX(270);
           pmt_4.setLayoutY(208);
           pmt_4.setStyle("-fx-font:bold 14px 'arialblack';-fx-background-radius:22px");

        Button calculate_4 = new Button("Calculate");
          calculate_4.setLayoutX(350);
          calculate_4.setLayoutY(300);
          calculate_4.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");
        Button Keyboard_4 = new Button("Keyboard");
          Keyboard_4.setLayoutX(40);
          Keyboard_4.setLayoutY(300);
          Keyboard_4.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-background-radius:28px;" +
                "-fx-padding:12px;-fx-font:bold 20px 'arialblack'");

        Pane base_4 = new Pane();
          base_4.setStyle("-fx-background-color:lightblue;");
        base_4.getChildren().addAll(M_lb1,M_lb2,M_lb3,M_lb4,M_amount,interest_4,pmt_4,terms_4,ans_4,calculate_4,Keyboard_4);
        Mortgage.setContent(base_4);
        //--------------------------------------------------------------------------------------------
        Tab Help = new Tab("Help");


        Label H_lb1 = new Label();
          H_lb1.setText("- This Calculator have 4 main(calculation) parts and those are Compound Saving, Saving, \n   Loan, and Mortgage. So, you able to " +
                  "calculate one of the components of these 4 parts. ");
          H_lb1.setLayoutY(20);
          H_lb1.setLayoutX(15);
          H_lb1.setStyle("-fx-text-fill: white;-fx-font:bold 11px 'arialblack'");

        Label H_lb2 = new Label();
          H_lb2.setText("- You must use our system keyboard only (not your device keyboard).");
          H_lb2.setLayoutY(60);
          H_lb2.setLayoutX(15);
          H_lb2.setStyle("-fx-text-fill: white;-fx-font:bold 11px 'arialblack'");
        Label H_lb3 = new Label();
          H_lb3.setText("- You want to give inputs for 3 values to calculate 4th Value(The field in which the user " +
                  "\n  wishes to estimate one of the parameters should be left blank) but you can't calculate \n  all components from the calculator only " +
                  "specialized components are calculate able\n  and those are:- " +
                  "\n                   Compound Saving = Start principal, Interest Rate, Terms, Future Values" +
                  "\n                   Saving                    = Terms, PMT, Future Value" +
                  "\n                   Loan                       = PMT, Loan Terms" +
                  "\n                   Mortgage               = PMT, Mortgage Terms ");
          H_lb3.setStyle("-fx-text-fill: white;-fx-font:bold 11px 'arialblack'");
          H_lb3.setLayoutY(90);
          H_lb3.setLayoutX(15);

        Label H_lb4 = new Label();
          H_lb4.setText("- Eg : if you want to calculate Future value from Saving Calculator first  want to fill other\n          three values " +
                  "with the help of keyboard then click the calculate Button. ");
          H_lb4.setLayoutX(15);
          H_lb4.setLayoutY(240);
          H_lb4.setStyle("-fx-text-fill: white;-fx-font:bold 11px 'arialblack'");

        Label H_lb5 = new Label();
         H_lb5.setText("- If system say 'Invalid Input' that mean you input is wrong so, please check your inputs \n  and check you fill the all" +
                 " the wanted text field also. ");
         H_lb5.setLayoutX(15);
         H_lb5.setLayoutY(280);
         H_lb5.setStyle("-fx-text-fill: white;-fx-font:bold 11px 'arialblack'");

        Label H_lb6 = new Label();
          H_lb6.setText("- For using Key Board please 'Click' the Keyboard button in every section. ");
          H_lb6.setLayoutX(15);
          H_lb6.setLayoutY(320);
          H_lb6.setStyle("-fx-text-fill: white;-fx-font:bold 11px 'arialblack'");

        Pane base_5=new Pane();
          base_5.setStyle("-fx-background-color:black;");
        base_5.getChildren().addAll(H_lb1,H_lb2,H_lb3,H_lb4,H_lb5,H_lb6);
        Help.setContent(base_5);
        //--------------------------------------------------------------------------------------------
        //mortgage calculations
        calculate_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (M_amount.getText().length() != 0 && interest_4.getText().length() != 0) {
                        //checking calculation part
                        if (pmt_4.getText().length() == 0) {
                            if (terms_4.getText().length() != 0) {
                                double p = Double.parseDouble(M_amount.getText());
                                double t = Double.parseDouble(terms_4.getText());
                                double r = Double.parseDouble(interest_4.getText());

                                double pmt = (p * (r / (12 * 100)) * Math.pow((1 + ((r / 100) / 12)), 12 * t)) / (Math.pow((1 + ((r / 100) / 12)), 12 * t) - 1);
                                double pmt_r = Math.round(pmt * 100.00) / 100.00;
                                ans_4.setText("PMT = " + pmt_r + " Rs");
                                ans_4.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                            } else if (terms_4.getText().length() == 0) {
                                ans_4.setText("Invalid Input ");
                                ans_4.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                            }
                        } else if (terms_4.getText().length() == 0) {
                            if (pmt_4.getText().length() != 0) {
                                double p = Double.parseDouble(M_amount.getText());
                                double pmt = Double.parseDouble(pmt_4.getText());
                                double r = Double.parseDouble(interest_4.getText());

                                double t = Math.log10((1 - (((r / 100) * p) / pmt)) / (Math.log10(1 + (r / 100)) * 12));
                                double t_r = Math.round(t * 100.00) / 100.00;

                                ans_4.setText("Total Mortgage Term is " + t_r + " Years ( " + 12 * Math.round(t_r) + " Months )");
                                ans_4.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                            } else if (pmt_4.getText().length() == 0) {
                                ans_4.setText("Invalid Input");
                                ans_4.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                            }
                        } else {
                            ans_4.setText("Invalid Input");
                            ans_4.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                        }
                    } else {
                        ans_4.setText("Invalid Input");
                        ans_4.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                    }



                }
                catch (Exception e){
                    ans_4.setText("Invalid Input");
                    ans_4.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                            "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                }
            }
        });
        //-----------------------------------------------------------------------------------------------------------------------
        //calculation for loan
        calculate_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (L_amount.getText().length() != 0 && interest_3.getText().length() != 0) {
                        //checking calculation part

                        if (pmt_3.getText().length() == 0) {
                            if (terms_3.getText().length() != 0) {
                                double p = Double.parseDouble(L_amount.getText());
                                double t = Double.parseDouble(terms_3.getText());
                                double r = Double.parseDouble(interest_3.getText());

                                double pmt = (p * (r / (12 * 100)) * Math.pow((1 + ((r / 100) / 12)), 12 * t)) / (Math.pow((1 + ((r / 100) / 12)), 12 * t) - 1);
                                double pmt_r = Math.round(pmt * 100.00) / 100.00;
                                ans_3.setText("PMT = " + pmt_r + " Rs");
                                ans_3.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                            } else if (terms_3.getText().length() == 0) {
                                ans_3.setText("Invalid Input ");
                                ans_3.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                            }
                        } else if (terms_3.getText().length() == 0) {
                            if (pmt_3.getText().length() != 0) {
                                double p = Double.parseDouble(L_amount.getText());
                                double pmt = Double.parseDouble(pmt_3.getText());
                                double r = Double.parseDouble(interest_3.getText());

                                double t = Math.log10((1 - (((r / 100) * p) / pmt)) / (Math.log10(1 + (r / 100)) * 12));
                                double t_r = Math.round(t * 100.00) / 100.00;
                                ans_3.setText("Total Mortgage Term is " + t_r + " Years ( " + Math.round(12 * t) + " Months )");
                                ans_3.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                            } else if (pmt_3.getText().length() == 0) {
                                ans_3.setText("Invalid Input");
                                ans_3.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                            }
                        } else {
                            ans_3.setText("Invalid Input");
                            ans_3.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                        }
                    } else {
                        ans_3.setText("Invalid Input");
                        ans_3.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                    }
                }
                catch(Exception e){
                    ans_3.setText("Invalid Input");
                    ans_3.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                            "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                }
            }
        });
        //-----------------------------------------------------------------------------------------------------------------------
        //calculation for Compound Saving
        calculate_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (fut_1.getText().length() == 0) {
                        if (terms_1.getText().length() != 0 && interest_1.getText().length() != 0 && C_amount.getText().length() != 0) {
                            double p = Double.parseDouble(C_amount.getText());
                            double r = Double.parseDouble(interest_1.getText());
                            double t = Double.parseDouble(terms_1.getText());

                            double A = p * Math.pow((1 + (r / (100 * 12))), 12 * t);

                            double A_r = Math.round(A * 100.00) / 100.00;
                            ans_1.setText("Future Value = " + A_r + " Rs");
                            ans_1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                        } else {
                            ans_1.setText("Invalid Input ");
                            ans_1.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                        }

                    } else if (terms_1.getText().length() == 0) {
                        if (fut_1.getText().length() != 0 && interest_1.getText().length() != 0 && C_amount.getText().length() != 0) {
                            double p = Double.parseDouble(C_amount.getText());
                            double r = Double.parseDouble(interest_1.getText());
                            double A = Double.parseDouble(fut_1.getText());

                            double t = (Math.log10(A / p)) / (12 * Math.log10(1 + (r / (12 * 100))));
                            double t_r = Math.round(t * 100.00) / 100.00;
                            ans_1.setText("Total Terms " + t_r + "Years (" + Math.round(t_r * 12) + " Months)");
                            ans_1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                        } else {
                            ans_1.setText("Invalid Input ");
                            ans_1.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                        }

                    } else if (interest_1.getText().length() == 0) {
                        if (terms_1.getText().length() != 0 && fut_1.getText().length() != 0 && C_amount.getText().length() != 0) {
                            double p = Double.parseDouble(C_amount.getText());
                            double A = Double.parseDouble(fut_1.getText());
                            double t = Double.parseDouble(terms_1.getText());

                            double r = 12 * (Math.pow((A / p), (1 / (12 * t))) - 1);
                            double r_r = Math.round(r * 100.00) / 100.00;
                            ans_1.setText("Interest Rate = " + r_r * 100 + " %");
                            ans_1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                        } else {
                            ans_1.setText("Invalid Input ");
                            ans_1.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                        }

                    } else if (C_amount.getText().length() == 0) {
                        if (terms_1.getText().length() != 0 && interest_1.getText().length() != 0 && fut_1.getText().length() != 0) {
                            double A = Double.parseDouble(fut_1.getText());
                            double r = Double.parseDouble(interest_1.getText());
                            double t = Double.parseDouble(terms_1.getText());

                            double p = (A / Math.pow((1 + (r / 1200)), 12 * t));
                            double p_r = Math.round(p * 100.00) / 100.00;
                            ans_1.setText("Start Principal = " + p_r + " Rs");
                            ans_1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                        } else {
                            ans_1.setText("Invalid Input ");
                            ans_1.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                        }
                    } else {
                        ans_1.setText("Invalid Input ");
                        ans_1.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                    }
                }
                catch (Exception e){
                    ans_1.setText("Invalid Input ");
                    ans_1.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                            "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                }
            }
        });
        //-----------------------------------------------------------------------------------------------------------------------
        //Saving calculation
        calculate_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (interest_2.getText().length() != 0) {
                        if (fut_2.getText().length() == 0) {
                            if (terms_2.getText().length() != 0 && pmt_2.getText().length() != 0 && S_amount.getText().length() != 0) {
                                double r = Double.parseDouble(interest_2.getText());
                                double t = Double.parseDouble(terms_2.getText());
                                double pmt = Double.parseDouble(pmt_2.getText());
                                double p = Double.parseDouble(S_amount.getText());

                                double A_1 = p * Math.pow((1 + (r / (100 * 12))), 12 * t);
                                double A_2 = pmt * ((Math.pow((1 + (r / (12 * 100))), 12 * t) - 1) / (r / 12 * 100));
                                double A_r = Math.round((A_1 + A_2) * 100.00) / 100.00;
                                ans_2.setText("Future Value = " + A_r + " Rs");
                                ans_2.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                            } else {
                                ans_2.setText("Invalid Input ");
                                ans_2.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                            }

                        } else if (terms_2.getText().length() == 0) {
                            if (fut_2.getText().length() != 0 && pmt_2.getText().length() != 0) {
                                double r = Double.parseDouble(interest_2.getText());
                                double A = Double.parseDouble(fut_2.getText());
                                double pmt = Double.parseDouble(pmt_2.getText());

                                double t = Math.log10((1 + (((r / 100) * A) / pmt)) / (Math.log10(1 + (r / 100)) * 12));
                                double t_r = Math.round(t * 100.00) / 100.00;
                                ans_2.setText("Total Terms " + t_r + "Years;");
                                ans_2.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                            } else {
                                ans_2.setText("Invalid Input ");
                                ans_2.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                            }

                        } else if (pmt_2.getText().length() == 0) {
                            if (terms_2.getText().length() != 0 && fut_2.getText().length() != 0) {
                                double r = Double.parseDouble(interest_2.getText());
                                double A = Double.parseDouble(fut_2.getText());
                                double t = Double.parseDouble(terms_2.getText());

                                double pmt = A / ((Math.pow((1 + (r / (12 * 100))), 12 * t) - 1) / (r / 12 * 100));
                                double pmt_r = Math.round(pmt * 100.00) / 100.00;
                                ans_2.setText("Interest Rate = " + pmt_r + " Rs");
                                ans_2.setStyle("-fx-background-color:darkslateblue;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");


                            } else {
                                ans_2.setText("Invalid Input ");
                                ans_2.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                        "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                            }
                        } else {
                            ans_2.setText("Invalid Input ");
                            ans_2.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                    "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                        }

                    } else {
                        ans_2.setText("Invalid Input");
                        ans_2.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                                "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");

                    }

                }
                catch (Exception e){
                    ans_2.setText("Invalid Input");
                    ans_2.setStyle("-fx-background-color:red;-fx-text-fill: white;-fx-padding:6" +
                            "px;-fx-background-radius:28px;-fx-font:bold 16px 'arialblack'");
                }
            }
        });
        //-----------------------------------------------------------------------------------------------------------------------
        //creating  keyboard
        Keyboard_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage_1 = new Stage();
                GridPane gridPane = new GridPane();


                Button key1 = new Button("1");
                  key1.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key2 = new Button("2");
                  key2.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key3 = new Button("3");
                  key3.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key4 = new Button("4");
                  key4.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key5 = new Button("5");
                  key5.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key6 = new Button("6");
                  key6.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key7 = new Button("7");
                  key7.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key8 = new Button("8");
                  key8.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key9 = new Button("9");
                  key9.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key10= new Button("0");
                  key10.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key11= new Button(".");
                  key11.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key12= new Button("<-");
                  key12.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");

                gridPane.setMinSize(240, 320);
                key1.setMinSize(80,80);
                key2.setMinSize(80,80);
                key3.setMinSize(80,80);
                key4.setMinSize(80,80);
                key5.setMinSize(80,80);
                key6.setMinSize(80,80);
                key7.setMinSize(80,80);
                key8.setMinSize(80,80);
                key9.setMinSize(80,80);
                key10.setMinSize(80,80);
                key11.setMinSize(80,80);
                key12.setMinSize(80,80);


                gridPane.add(key1, 0, 0);
                gridPane.add(key2, 1, 0);
                gridPane.add(key3, 0, 1);
                gridPane.add(key4, 1, 1);
                gridPane.add(key5, 2, 1);
                gridPane.add(key6, 0, 2);
                gridPane.add(key7, 1, 2);
                gridPane.add(key8, 2, 2);
                gridPane.add(key9, 0, 3);
                gridPane.add(key10, 1, 3);
                gridPane.add(key11, 2, 3);
                gridPane.add(key12, 2, 0);




                C_amount.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText( C_amount.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                C_amount.setText(C_amount.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots =0;
                                String text = C_amount.getText();
                                for (int i = 0; i<text.length(); i++ ){
                                    char Dots = text.charAt(i);

                                    if (Dots=='.'){
                                        totalDots = totalDots+1;
                                    }
                                }
                                if ( totalDots ==0){
                                    C_amount.setText(text+".");
                                }
                                else {
                                    C_amount.setText(text+"");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = C_amount.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                }else {
                                    last_text = "";
                                }
                                C_amount.setText(last_text);
                            }
                        });
                    }
                });
                interest_1.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1 .getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_1.setText(interest_1.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots =0;
                                String text =interest_1.getText();
                                for (int i = 0; i<text.length(); i++ ){
                                    char Dots = text.charAt(i);

                                    if (Dots=='.'){
                                        totalDots = totalDots+1;
                                    }
                                }
                                if ( totalDots ==0){
                                    interest_1.setText(text+".");
                                }
                                else {
                                    interest_1.setText(text+"");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = interest_1.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                }else {
                                    last_text = "";
                                }
                                interest_1.setText(last_text);
                            }
                        });

                    }
                });
                terms_1.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText( terms_1.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_1.setText(terms_1.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots =0;
                                String text = terms_1.getText();
                                for (int i = 0; i<text.length(); i++ ){
                                    char Dots = text.charAt(i);

                                    if (Dots=='.'){
                                        totalDots = totalDots+1;
                                    }
                                }
                                if ( totalDots ==0){
                                    terms_1.setText(text+".");
                                }
                                else {
                                    terms_1.setText(text+"");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = terms_1.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                }else {
                                    last_text = "";
                                }
                                terms_1.setText(last_text);
                            }
                        });

                    }
                });
                fut_1.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText( fut_1.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_1.setText(fut_1.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots =0;
                                String text = fut_1.getText();
                                for (int i = 0; i<text.length(); i++ ){
                                    char Dots = text.charAt(i);

                                    if (Dots=='.'){
                                        totalDots = totalDots+1;
                                    }
                                }
                                if ( totalDots ==0){
                                    fut_1.setText(text+".");
                                }
                                else {
                                    fut_1.setText(text+"");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = fut_1.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                }else {
                                    last_text = "";
                                }
                                fut_1.setText(last_text);
                            }
                        });


                    }
                });


                Scene scene = new Scene(gridPane);
                stage_1.setTitle("Key Board");
                stage_1.setScene(scene);
                stage_1.show();


            }


        });
        //-------------------------------------------------------------------------------------------------------------------------
        //keyboard-2
        Keyboard_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage_2 = new Stage();
                GridPane gridPane = new GridPane();

                Button key1 = new Button("1");
                  key1.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key2 = new Button("2");
                  key2.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key3 = new Button("3");
                  key3.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key4 = new Button("4");
                  key4.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key5 = new Button("5");
                  key5.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key6 = new Button("6");
                  key6.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key7 = new Button("7");
                  key7.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key8 = new Button("8");
                  key8.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key9 = new Button("9");
                  key9.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key10= new Button("0");
                  key10.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key11= new Button(".");
                  key11.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key12= new Button("<-");
                  key12.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");

                gridPane.setMinSize(240, 320);
                key1.setMinSize(80, 80);
                key2.setMinSize(80, 80);
                key3.setMinSize(80, 80);
                key4.setMinSize(80, 80);
                key5.setMinSize(80, 80);
                key6.setMinSize(80, 80);
                key7.setMinSize(80, 80);
                key8.setMinSize(80, 80);
                key9.setMinSize(80, 80);
                key10.setMinSize(80, 80);
                key11.setMinSize(80, 80);
                key12.setMinSize(80, 80);


                gridPane.add(key1, 0, 0);
                gridPane.add(key2, 1, 0);
                gridPane.add(key3, 0, 1);
                gridPane.add(key4, 1, 1);
                gridPane.add(key5, 2, 1);
                gridPane.add(key6, 0, 2);
                gridPane.add(key7, 1, 2);
                gridPane.add(key8, 2, 2);
                gridPane.add(key9, 0, 3);
                gridPane.add(key10, 1, 3);
                gridPane.add(key11, 2, 3);
                gridPane.add(key12, 2, 0);

                S_amount.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                S_amount.setText(S_amount.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = S_amount.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    S_amount.setText(text + ".");
                                } else {
                                    S_amount.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = S_amount.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                S_amount.setText(last_text);
                            }
                        });
                    }
                });
                interest_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_2.setText(interest_2.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = interest_2.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    interest_2.setText(text + ".");
                                } else {
                                    interest_2.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = interest_2.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                interest_2.setText(last_text);
                            }
                        });

                    }
                });
                terms_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_2.setText(terms_2.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = terms_2.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    terms_2.setText(text + ".");
                                } else {
                                    terms_2.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = terms_2.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                terms_2.setText(last_text);
                            }
                        });

                    }
                });
                fut_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                fut_2.setText(fut_2.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = fut_2.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    fut_2.setText(text + ".");
                                } else {
                                    fut_2.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = fut_2.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                fut_2.setText(last_text);
                            }
                        });


                    }
                });
                pmt_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = pmt_2.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    pmt_2.setText(text + ".");
                                } else {
                                    pmt_2.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = pmt_2.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                pmt_2.setText(last_text);
                            }
                        });

                    }
                });


                Scene scene = new Scene(gridPane);
                stage_2.setTitle("Key Board");
                stage_2.setScene(scene);
                stage_2.show();
            }


        });
        //------------------------------------------------------------------------------------------------------------------------
        //keyboard-3
        Keyboard_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage_3 = new Stage();
                GridPane gridPane = new GridPane();

                Button key1 = new Button("1");
                  key1.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key2 = new Button("2");
                  key2.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key3 = new Button("3");
                  key3.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key4 = new Button("4");
                  key4.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key5 = new Button("5");
                  key5.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key6 = new Button("6");
                  key6.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key7 = new Button("7");
                  key7.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key8 = new Button("8");
                  key8.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key9 = new Button("9");
                  key9.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key10= new Button("0");
                  key10.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key11= new Button(".");
                  key11.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key12= new Button("<-");
                  key12.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");

                gridPane.setMinSize(240, 320);
                key1.setMinSize(80, 80);
                key2.setMinSize(80, 80);
                key3.setMinSize(80, 80);
                key4.setMinSize(80, 80);
                key5.setMinSize(80, 80);
                key6.setMinSize(80, 80);
                key7.setMinSize(80, 80);
                key8.setMinSize(80, 80);
                key9.setMinSize(80, 80);
                key10.setMinSize(80, 80);
                key11.setMinSize(80, 80);
                key12.setMinSize(80, 80);


                gridPane.add(key1, 0, 0);
                gridPane.add(key2, 1, 0);
                gridPane.add(key3, 0, 1);
                gridPane.add(key4, 1, 1);
                gridPane.add(key5, 2, 1);
                gridPane.add(key6, 0, 2);
                gridPane.add(key7, 1, 2);
                gridPane.add(key8, 2, 2);
                gridPane.add(key9, 0, 3);
                gridPane.add(key10, 1, 3);
                gridPane.add(key11, 2, 3);
                gridPane.add(key12, 2, 0);

                L_amount.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                L_amount.setText(L_amount.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = L_amount.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    L_amount.setText(text + ".");
                                } else {
                                    L_amount.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = L_amount.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                L_amount.setText(last_text);
                            }
                        });
                    }
                });
                interest_3.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_3.setText(interest_3.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = interest_3.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    interest_3.setText(text + ".");
                                } else {
                                    interest_3.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = interest_3.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                interest_3.setText(last_text);
                            }
                        });

                    }
                });
                terms_3.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_3.setText(terms_3.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = terms_3.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    terms_3.setText(text + ".");
                                } else {
                                    terms_3.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = terms_3.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                terms_3.setText(last_text);
                            }
                        });

                    }
                });
                pmt_3.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_2.setText(pmt_2.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = pmt_3.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    pmt_3.setText(text + ".");
                                } else {
                                    pmt_3.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = pmt_3.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                pmt_3.setText(last_text);
                            }
                        });

                    }
                });


                Scene scene = new Scene(gridPane);
                stage_3.setTitle("Key Board");
                stage_3.setScene(scene);
                stage_3.show();
            }


        });
        //----------------------------------------------------------------------------------------------------------------------------
        //keyboard-4
        Keyboard_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage_4 = new Stage();
                GridPane gridPane = new GridPane();

                Button key1 = new Button("1");
                  key1.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key2 = new Button("2");
                  key2.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key3 = new Button("3");
                  key3.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key4 = new Button("4");
                  key4.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key5 = new Button("5");
                  key5.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key6 = new Button("6");
                  key6.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key7 = new Button("7");
                  key7.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key8 = new Button("8");
                  key8.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key9 = new Button("9");
                  key9.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key10= new Button("0");
                  key10.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key11= new Button(".");
                  key11.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");
                Button key12= new Button("<-");
                  key12.setStyle("-fx-text-fill: white;-fx-font:bold 20px 'arialblack';-fx-background-color:black;-fx-border-color:white");

                gridPane.setMinSize(240, 320);
                key1.setMinSize(80, 80);
                key2.setMinSize(80, 80);
                key3.setMinSize(80, 80);
                key4.setMinSize(80, 80);
                key5.setMinSize(80, 80);
                key6.setMinSize(80, 80);
                key7.setMinSize(80, 80);
                key8.setMinSize(80, 80);
                key9.setMinSize(80, 80);
                key10.setMinSize(80, 80);
                key11.setMinSize(80, 80);
                key12.setMinSize(80, 80);


                gridPane.add(key1, 0, 0);
                gridPane.add(key2, 1, 0);
                gridPane.add(key3, 0, 1);
                gridPane.add(key4, 1, 1);
                gridPane.add(key5, 2, 1);
                gridPane.add(key6, 0, 2);
                gridPane.add(key7, 1, 2);
                gridPane.add(key8, 2, 2);
                gridPane.add(key9, 0, 3);
                gridPane.add(key10, 1, 3);
                gridPane.add(key11, 2, 3);
                gridPane.add(key12, 2, 0);

                M_amount.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                M_amount.setText(M_amount.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = M_amount.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    M_amount.setText(text + ".");
                                } else {
                                    M_amount.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = M_amount.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                M_amount.setText(last_text);
                            }
                        });
                    }
                });
                interest_4.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                interest_4.setText(interest_4.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = interest_4.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    interest_4.setText(text + ".");
                                } else {
                                    interest_4.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = interest_4.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                interest_4.setText(last_text);
                            }
                        });

                    }
                });
                terms_4.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                terms_4.setText(terms_4.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = terms_4.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    terms_4.setText(text + ".");
                                } else {
                                    terms_4.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = terms_4.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                terms_4.setText(last_text);
                            }
                        });

                    }
                });
                pmt_4.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        key1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "1");
                            }
                        });
                        key2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "2");
                            }
                        });
                        key3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "3");
                            }
                        });
                        key4.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "4");
                            }
                        });
                        key5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "5");
                            }
                        });
                        key6.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "6");
                            }
                        });
                        key7.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_3.setText(pmt_3.getText() + "7");
                            }
                        });
                        key8.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "8");
                            }
                        });
                        key9.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "9");
                            }
                        });
                        key10.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                pmt_4.setText(pmt_4.getText() + "0");
                            }
                        });
                        key11.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                int totalDots = 0;
                                String text = pmt_4.getText();
                                for (int i = 0; i < text.length(); i++) {
                                    char Dots = text.charAt(i);

                                    if (Dots == '.') {
                                        totalDots = totalDots + 1;
                                    }
                                }
                                if (totalDots == 0) {
                                    pmt_4.setText(text + ".");
                                } else {
                                    pmt_4.setText(text + "");
                                }
                            }
                        });
                        key12.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                String text = pmt_3.getText();
                                String last_text;
                                if (text.length() != 0) {
                                    int last = text.length() - 1;
                                    last_text = text.substring(0, last);
                                } else {
                                    last_text = "";
                                }
                                pmt_3.setText(last_text);
                            }
                        });

                    }
                });


                Scene scene = new Scene(gridPane);
                stage_4.setTitle("Key Board");
                stage_4.setScene(scene);
                stage_4.show();
            }


        });
        //--------------------------------------------------------------------------------------------------------------------------------

        calculator.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        calculator.getTabs().addAll(Compound_saving,Saving,Loans,Mortgage,Help);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(calculator, 500, 400));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
