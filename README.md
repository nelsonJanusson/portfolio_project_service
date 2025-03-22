# Project Service Description
This repository contains the code for the microservice handling projects in my portfolio website. An description of the whole portfolio website can be found [here](https://github.com/nelsonJanusson/portfolio_description).

Whenever a new release/tag is pushed to the main branch a github action is triggered that uses the dockerfile in the root directory to build an image that is then added to 
a dockerhub container registry accessible [here](https://hub.docker.com/repository/docker/nelsonjanusson/portfolio_project/general).
