#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int val;
    struct Node *next;
};

typedef struct Node node_t;
typedef node_t *ListNodePtr;

void printList(ListNodePtr head);
void push_back(ListNodePtr *head, int value);

int main(void)
{
    ListNodePtr List = NULL;

    for (int i = 1; i < 5; i++)
    {
        push_back(&List, i);
    }

    printf("\n\t");
    printList(List);
    printf("\n\n");

    return 0;
}

void push_back(ListNodePtr *head, int value)
{
    ListNodePtr new = malloc(sizeof(node_t));
    new->val = value;
    new->next = NULL;

    if (*head == NULL)
    {
        *head = new;
        return;
    }

    ListNodePtr current = *head;

    while ((current->next != NULL))
    {
        current = current->next;
    }
    current->next = new;
}

void printList(ListNodePtr head)
{
    while (head != NULL)
    {
        printf("%d ", head->val);
        head = head->next;
    }
}