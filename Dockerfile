# OpenJDK 17 기반 이미지 사용
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
# WORKDIR /app

# 빌드된 jar 파일을 컨테이너에 복사
COPY target/*SNAPSHOT.jar app.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-Duser.timezone=Asia/Seoul", "-Dfile.encoding=UTF-8", "-jar", "/app.jar"]
