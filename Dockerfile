# ─────────────────────────────────────────────────
#  Static Website Deployment using Nginx
# ─────────────────────────────────────────────────
FROM nginx:alpine

# Maintainer label (updated)
LABEL maintainer="yash-sharma" \
      project="lab1" \
      description="Static website served via Nginx"

# Remove default Nginx content
RUN rm -rf /usr/share/nginx/html/*

# Copy website files
COPY src/main/resources/index.html  /usr/share/nginx/html/index.html
COPY src/main/resources/styles.css  /usr/share/nginx/html/styles.css

# Expose port
EXPOSE 80

# Run Nginx
CMD ["nginx", "-g", "daemon off;"]