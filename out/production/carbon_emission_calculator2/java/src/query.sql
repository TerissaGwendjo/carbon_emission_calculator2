--Create users table
CREATE TABLE Users (
                       user_id SERIAL PRIMARY KEY,
                       username VARCHAR(255) NOT NULL ,
                       email VARCHAR(255) NOT NULL ,
                       password_hash VARCHAR (255) NOT NULL
);

--Create Activities Table
CREATE TABLE Activities (
                            activity_id SERIAL PRIMARY KEY,
                            name VARCHAR (255) NOT NULL ,
                            description TEXT
);

-- Emission_Factors Table
CREATE TABLE Emission_Factors (
                                  factor_id SERIAL PRIMARY KEY,
                                  activity_id INT REFERENCES activities(activity_id),
                                  factor DECIMAL NOT NULL ,
                                  unit VARCHAR (50) NOT NULL
);

-- User_Emissions Table
CREATE TABLE User_Emissions (
                                emission_id SERIAL PRIMARY KEY,
                                user_id INT REFERENCES users (user_id),
                                activity_id INT REFERENCES activities (activity_id),
                                quantity DECIMAL NOT NULL ,
                                emission DECIMAL NOT NULL ,
                                date DATE NOT NULL
);

-- Emission_Goals Table
CREATE TABLE Emission_Goals (
                                goal_id SERIAL PRIMARY KEY,
                                user_id INT REFERENCES users (user_id),
                                target_emission DECIMAL NOT NULL ,
                                start_date DATE NOT NULL ,
                                end_date DATE NOT NULL ,
                                status VARCHAR (50) NOT NULL

);

