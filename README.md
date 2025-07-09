# NES Struts 2.5.33 Trial

This repository provides a trial setup for the Never-Ending Support (NES) version of Struts 2.5.33. The example apps are from OSS struts 2.5.33 example apps. This project contains both maven and gradle examples.

# Running the Sample Application
To run the sample application, follow these steps:
1. build the Docker image `docker build . -t nes-struts2-apps`
2. Run the Docker container `docker run --rm -p 8080:8080 nes-struts2-apps`
3. Open the browser and navigate to `http://localhost:8080/`