REPO=phedri

push_image(){
  CONTAINER=$1
  docker image tag $CONTAINER $REPO/$CONTAINER
  docker images | grep $CONTAINER
  docker push $REPO/$CONTAINER
}

push_image gateway
push_image invoice
push_image productorder
push_image notification

open https://hub.docker.com/r/$REPO/
