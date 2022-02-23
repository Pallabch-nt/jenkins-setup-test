FROM gradle:4.10.3-jdk8-alpine
COPY . /tmp
WORKDIR /tmp
CMD ["gradle", "test"]
