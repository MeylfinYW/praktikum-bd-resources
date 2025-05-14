package com.example.bdsqltester.scenes.user;

import com.example.bdsqltester.datasources.MainDataSource;
import com.example.bdsqltester.dtos.Assignment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserController {
    @FXML
    private ListView<Assignment> assignmentList;
    @FXML private TextField idField;
    @FXML private TextField nameField;
    @FXML private TextArea instructionsField;
    @FXML private TextArea answerKeyField;
    @FXML private TextArea userQueryArea;
    @FXML private Label gradeLabel;

    Connection connection = MainDataSource.getConnection();