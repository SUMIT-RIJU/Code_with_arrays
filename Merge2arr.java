//Defining mergedArray with combined size of arrayA and arrayB

int[] mergedArray = new int[arrayA.length + arrayB.length];

//Initializing pointers of arrayA, arrayB and mergedArray with 0

int i=0, j=0, k=0;

//Inserting all elements of arrayA into mergedArray

while (i < arrayA.length)
{
 mergedArray[k] = arrayA[i];
 k++;
 i++;
}

//Inserting all elements of arrayB into mergedArray

while (j < arrayB.length)
{
 mergedArray[k] = arrayB[j];
 k++;
 j++;
}
