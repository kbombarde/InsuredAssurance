
# Insured Assurance CI-CD Deployment Pipeline

## Background

Insured Assurance, a leading global insurance provider based in the US, is transitioning to a DevOps architecture to streamline its operations. The company offers various insurance products, including home, health, car, and life insurance. To enhance the automation of code builds and deployments across multiple environments, Insured Assurance has adopted GitHub Actions for code checkout, build, and test automation, alongside Jenkins for continuous deployment.

As a DevOps engineer at Insured Assurance, your task is to implement a CI/CD pipeline using GitHub Actions and Jenkins, ensuring efficient and reliable code deployment.

## Objective

To create a CI/CD pipeline workflow using GitHub Actions to automate the deployment of a Java application through Jenkins on a Tomcat Apache server.

## Tools

- Jenkins
    - GitHub Pulgin [ Jenkins Plugin ]
    - Deploy to container [ Jenkins Plugin ]
- Apache Tomcat
- GitHub
- GitHub Actions

## Pipeline Flow Design
![](https://i.ibb.co/zS0k03y/flow.png)

## Tasks

I completed following tasks as part of setting up this project

- ### Create a GitHub Repository
    - Created github repository with our simple web application code
    - Insured Assurance Code Base : https://github.com/kbombarde/InsuredAssurance.git  
- ### Implement GitHub Actions Pipeline
    - Created a build.yml file under ```.github/workflows```
    - The Actions Pipeline is triggered after a new change is pushed to the repository
    - This actions pipeline performs below actions
        - Setting up maven and jdk
        - Caching Maven dependencies
        - Building Package with Maven
- ### Configure Tomcat Apache
    - Installed tomcat server on local
    - Configured a user account with ```manager-script``` role

- ### Pre Deployment Setup 
    - Installed required plugins in Jenkins
    - Setup credentials in Jenkins for Tomcat
    - Generate Token for Jenkins and setup a webhook to listen notifications from GitHub Actions

- ### Integrate GitHub Actions and Jenkins
    - Setup a **Notify Jenkins on Sucess** job which triggers an automatic build on Jenkins after successful build og GitHub Actions Workflow.

## Additional Tasks
- **Setup Domain Forwarding** for forwarding public domain to http://localhost:8080 using ```ngrok```, this helps in setting up webhooks between Jenkins & GitHub
